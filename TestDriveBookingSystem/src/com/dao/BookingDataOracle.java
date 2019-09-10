package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.beans.Booking;
import com.util.DBUtil;

public class BookingDataOracle {

	public int addBooking(Booking book)  {
		Connection con = null;
		try {

			con = DBUtil.getDBConnection();
			String query = "insert into tbl_booking (booking_id, customer_name, license_no, vehicle_make, proposed_date) values (?, ?, ?, ?, to_date(?,'MM/DD/YYYY'))";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setInt(1, book.getBookId());
			pstmt.setString(2, book.getCustomerName());
			pstmt.setString(3, book.getLicenseNo());
			pstmt.setString(4, book.getVehicleMake());
			pstmt.setString(5, book.getProposedDate());

			pstmt.execute();

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 1;
	}

	
	public List<Booking> getBooksByDate(String date) {
		List<Booking> bookList = new ArrayList<Booking>();

		Connection con = null;
		try {

			con = DBUtil.getDBConnection();
			String query = "select * from tbl_booking where proposed_date = to_date(?,'DD/MM/YYYY')";

			PreparedStatement pstmt = con.prepareStatement(query);

			pstmt.setString(1, date);

			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Booking book = null;
				int id = rs.getInt("booking_id");
				String name = rs.getString("customer_name");
				String licenseNo = rs.getString("license_no");
				String vehicleMake = rs.getString("vehicle_make");
				String proposedDate = rs.getString("proposed_date");

				book = new Booking(id, name, licenseNo, vehicleMake, proposedDate);
				bookList.add(book);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				DBUtil.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return bookList;
	}

}
