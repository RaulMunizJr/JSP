//if radio button is yes (admin Dashboard)
$(function() {
	$('input[name="optradio"]').on('click', function() {
		if ($(this).val() == 'Yes') {
			$('#textboxes').show();
		} else {
			$('#textboxes').hide();
		}
	});
});

// check password 8 chars (login page)
function validatePerson() {
	var valid = true;
	var message = "Login Successfully!";
	var pwd = document.forms.loginform.password.value;
	var usr = document.forms.loginform.loginid.value;

	if (pwd == "") {
		valid = false;
		message = "You must enter a password!";
	} else if (pwd.length < 8) {
		valid = false;
		message = "Password must contain 8 characters!";
	} else if (usr == "") {
		valid = false;
		message = "Please enter !";
	}

	if (!valid) {
		document.getElementById("alert").innerHTML = message;
	}
	return valid;

}
function authorizePerson() {
	var valid = validatePerson();
	var person = document.forms.loginform.user.value;
	
	var loc = window.location.pathname;
	var dir = loc.substring(0, loc.lastIndexOf('/'));
	
	var memdir = dir + "/memberDashboard.html";
	var admindir = dir + "/adminDashboard.html"
	if (valid) {
		if (person == "member") {
			location.href = memdir;
		} else if (person == "admin") {
			location.href = admindir;
		} else {
			document.getElementById("alert").innerHTML = "Invalid";
		}
	}
}
