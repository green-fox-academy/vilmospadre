function validatePassword(){
    if(password.value != confirm_password.value) {
        confirm_password.setCustomValidity("Passwords doesn't match, please try again!");
    } else {
        confirm_password.setCustomValidity('');
    }
}