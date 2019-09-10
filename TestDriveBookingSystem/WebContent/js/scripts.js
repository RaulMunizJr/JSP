//validates date input as DD/MM/YYYY (testDrivingBooking.jsp)
function isValidDate(drivedate) {
	// First check for the pattern
	if (!/^\d{1,2}\/\d{1,2}\/\d{4}$/.test(drivedate))
		return false;

	// Parse the date parts to integers
	var parts = dateString.split("/");
	var day = parseInt(parts[1], 10);
	var month = parseInt(parts[0], 10);
	var year = parseInt(parts[2], 10);

	// Check the ranges of month and year
	if (year < 1000 || year > 3000 || month == 0 || month > 12)
		return false;

	var monthLength = [ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 ];

	// Adjust for leap years
	if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		monthLength[1] = 29;

	// Check the range of the day
	return day > 0 && day <= monthLength[month - 1];
};

// check validaton for booking (testDrivingBooking.jsp)
function validateBooking() {
	var valid = true;
	var message = "Booked Successfully!";

	var id = document.forms.homeform.id.value;
	var name = document.forms.homeform.name.value;
	var dlnumber = document.forms.homeform.dlnumber.value;
	var drivedate = document.forms.homeform.drivedate.value;

	if (id == "") {
		valid = false;
		message = "You must enter an ID!";
	} else if (name == "") {
		valid = false;
		message = "You must enter a Name!";
	} else if (dlnumber == "") {
		valid = false;
		message = "You must enter a Drivers Lisence number!";
	} else if (drivedate == "" && isValidDate(drivedate) == false) {
		valid = false;
		message = "You must enter a valid Date!";
	}

	if (!valid) {
		document.getElementById("alert").innerHTML = message;
	}
	return valid;
}
