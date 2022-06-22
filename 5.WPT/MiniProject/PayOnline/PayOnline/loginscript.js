const container = document.querySelector('.container'),
    pwShowHide = document.querySelectorAll('.showHidePw'),
    pwFields = document.querySelectorAll('.password'),
    signUp = document.querySelector('.Signup-link'),
    login = document.querySelector('.login-link');

//js code to show/hide password and change icon
pwShowHide.forEach(eyeIcon => {
    eyeIcon.addEventListener('click', () => {
        pwFields.forEach(pwFields => {
            if (pwFields.type === "password") {
                pwFields.type = 'text';

                pwShowHide.forEach(icon => {
                    icon.classList.replace("uil-eye-slash", "uil-eye");
                })
            } else {
                pwFields.type = 'password';

                pwShowHide.forEach(icon => {
                    icon.classList.replace("uil-eye", "uil-eye-slash");
                })
            }
        })

    })
})


//js code to appear signup and login form
signUp.addEventListener('click', () => {
    container.classList.add("active");
});

login.addEventListener('click', () => {
    container.classList.remove("active");
});


// Registration Local Storage array and function
let registration_array = [];

//localStorage.setItem('reg_details',registration_array);
registration_array=localStorage.getItem('reg_details')
registration_array=JSON.parse(registration_array);
function adduser() {
    let obj = {
        username: $("#name").val(),
        email: $("#email").val(),
        pass: $("#pass2").val()
    }
    registration_array.push(obj);
    localStorage.setItem('reg_details', JSON.stringify(registration_array));
}







$(document).ready(function () {
    // set initially button state hidden





    // use keyup event on email field
    $("#email").keyup(function () {
        if (validateEmail()) {
            // if the email is validated
            // set input email border green
            $("#email").css("border", "2px solid green");
            // and set label 
            $("#emailMsg").html("<p class='text-success'></p>");

        } else {
            // if the email is not validated
            // set border red
            $("#email").css("border", "2px solid red");
            $("#emailMsg").html("<p class='text-danger'>Invalid Email</p>");
        }

    });
    // use keyup event on password
    $("#pass1").keyup(function () {
        // check
        if (validatePassword()) {
            // set input password border green
            $("#pass1").css("border", "2px solid green");
            //set passMsg 
            $("#passMsg").html("<p class='text-success'></p>");

        } else {
            // set input password border red
            $("#pass1").css("border", "2px solid red");
            //set passMsg 
            $("#passMsg").html("<p class='text-danger'>Password not valid</p>");
        }

    });

    $("#pass2").keyup(function () {
        if (confirmPassword()) {
            // set input password border green
            $("#pass2").css("border", "2px solid green");
            //set passMsg 
            $("#passMsg1").html("<p class='text-success'>Password Match</p>");

        } else {
            // set input password border red
            $("#pass2").css("border", "2px solid red");
            //set passMsg 
            $("#passMsg1").html("<p class='text-danger'>Password not Match</p>");
        }


    });








    //login validation

    $("#loginemail").keyup(function () {
        if (validateLoginEmail()) {
            // if the email is validated
            // set input email border green
            $("#loginemail").css("border", "2px solid green");
            // and set label 


        } else {
            // if the email is not validated
            // set border red
            $("#loginemail").css("border", "2px solid red");

        }

    });



    $("#loginpass").keyup(function () {
        if (validateLoginPassword()) {
            // set input password border green
            $("#loginpass").css("border", "2px solid green");
            //set passMsg 


        } else {
            // set input password border red
            $("#loginpass").css("border", "2px solid red");
            //set passMsg 

        }


    });

   



    $("#register").click(() => {
        if($('#name').val()!=="" && $("#email").val()!=="" && $("#pass2").val()!=="" ){
        adduser();
       alert('Registered Successfuly')
        }
        else{
            alert('Add Information')
        }
    });

    $("#login").click(() => {
        console.log('login clicked');

        let arr=localStorage.getItem('reg_details');
        arr=JSON.parse(arr);
        
        for (let index = 0; index < arr.length; index++) {
            console.log(arr[index].username+" "+arr[index].email+" "+arr[index].pass);
            
            if((arr[index].email)===$('#loginemail').val() && (arr[index].pass===$('#loginpass').val())){
                console.log('login successful');
            $("#loginmsg").html("<p class='text-danger'></p>");
            goToURL();
            localStorage.setItem('username',arr[index].username);
            break;
            }
            else{
                $("#loginmsg").html("<p class='text-danger'>Invalid Login Credentials</p>");
                console.log('login unsuccessful');
            } 

        }
     
    });

});

function goToURL() {
    location.href = 'payonline.html';

}

function buttonState() {
    if (validateEmail() && validatePassword() && confirmPassword()) {
        // if the both email and password are validate
        // then button should show visible
        $("#btn").show();
    } else {
        // if both email and pasword are not validated
        // button state should hidden
        $("#btn").hide();
    }
}
function validateEmail() {
    // get value of input email
    var email = $("#email").val();
    // use reular expression
    var reg = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
    if (reg.test(email)) {
        return true;
    } else {
        return false;
    }

}

function validateLoginEmail() {
    // get value of input email
    var email = $("#loginemail").val();
    // use reular expression
    var reg = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/
    if (reg.test(email)) {
        return true;
    } else {
        return false;
    }

}



function validatePassword() {
    //get input password value
    var pass = $("#pass1").val();
    // check it s length
    if (pass.length > 7) {
        return true;
    } else {
        return false;
    }

}

function confirmPassword() {
    //get input password value
    var pass = $("#pass1").val();
    var pass2 = $("#pass2").val();
    // check it s length
    if (pass === pass2)
        return true;
    return false;

}


function validateLoginPassword() {
    //get input password value
    var pass = $("#loginpass").val();
    // check it s length
    if (pass.length > 7) {
        return true;
    } else {
        return false;
    }

}













