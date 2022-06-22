window.addEventListener("resize", function () {
    "use strict"; window.location.reload();
});


let feedback_array = [];
feedback_array=localStorage.getItem('feedback_details')
feedback_array=JSON.parse(feedback_array); 


function addfeedback() {
    let obj = {
        
        fname: $("#feedbackname").val(),
        femail: $("#feedbackemail").val(),
        fmessage: $("#addTxt").val()
    }
    console.log(obj.fname,obj.femail,obj.fmessage);
    console.log(feedback_array);
    feedback_array.push(obj);
    
    localStorage.setItem('feedback_details', JSON.stringify(feedback_array));
}


//Dom content loaded started
document.addEventListener("DOMContentLoaded", function () {

    // make it as accordion for smaller screens
    if (window.innerWidth > 992) {

        document.querySelectorAll('.navbar .nav-item').forEach(function (everyitem) {

            everyitem.addEventListener('mouseover', function (e) {

                let el_link = this.querySelector('a[data-bs-toggle]');

                if (el_link != null) {
                    let nextEl = el_link.nextElementSibling;
                    el_link.classList.add('show');
                    nextEl.classList.add('show');
                }

            });
            everyitem.addEventListener('mouseleave', function (e) {
                let el_link = this.querySelector('a[data-bs-toggle]');

                if (el_link != null) {
                    let nextEl = el_link.nextElementSibling;
                    el_link.classList.remove('show');
                    nextEl.classList.remove('show');
                }


            })
        });

    }
    // end if innerWidth
    //change signup button to login btn
    /*   $('#login').click(() => {
          $('#navwallet').css("display", "block");
          $('#navbank').css("display", "block");
          $('#dashboardpage').css("display", "block");
          $('#displaypage').css("display", "none");
          console.log('click login')
      }); */




    $('#bankT0').click(() => {
        $("#divLinkBank").css("display", "block");
        $("#divBankTransfer").css("display", "none");
        $("#displaypage").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divWalletBalance").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $("#divfeedback").css("display", "none");
        $("#divabout").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");

    });

    $('#bankT1').click(() => {
        $("#divBankTransfer").css("display", "block");
        $("#displaypage").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divWalletBalance").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $("#divfeedback").css("display", "none");
        $("#divabout").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");
    });

    $('#bankT2').click(() => {
        $("#divBankBalance").css("display", "block");
        $("#displaypage").css("display", "none");
        $("#divBankTransfer").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divWalletBalance").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $("#divfeedback").css("display", "none");
        $("#divabout").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");
    });

    $('#walletT1').click(() => {
        $("#divWalletRechargePage").css("display", "block");
        $("#displaypage").css("display", "none");
        $("#divBankTransfer").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletBalance").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $("#divfeedback").css("display", "none");
        $("#divabout").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");
    });

    $('#walletT2').click(() => {
        $("#divWalletBalance").css("display", "block");
        $("#displaypage").css("display", "none");
        $("#divBankTransfer").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $("#divfeedback").css("display", "none");
        $("#divabout").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");
    });

    $('#FeedBack').click(() => {
        $("#divfeedback").css("display", "block");
        $("#divWalletBalance").css("display", "none");
        $("#displaypage").css("display", "none");
        $("#divBankTransfer").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $("#divabout").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");
    });

    $('#about').click(() => {
        $("#divabout").css("display", "block");
        $("#divfeedback").css("display", "none");
        $("#divWalletBalance").css("display", "none");
        $("#displaypage").css("display", "none");
        $("#divBankTransfer").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");
    });

    
    $('#Reviews').click(() => {
        
        $("#divReviews").css("display", "block");
        $("#divabout").css("display", "none");
        $("#divfeedback").css("display", "none");
        $("#divWalletBalance").css("display", "none");
        $("#displaypage").css("display", "none");
        $("#divBankTransfer").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#dashboardpage").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");
    });


    $('#payonline').click(() => {
        $("#divBankTransfer").css("display", "none");
        $("#divBankBalance").css("display", "none");
        $("#divWalletRechargePage").css("display", "none");
        $("#divWalletBalance").css("display", "none");
        $("#divLinkBank").css("display", "none");
        $("#displaypage").css("display", "none");
        $("#divfeedback").css("display", "none");
        $("#divabout").css("display", "none");
        $("#divReviews").css("display", "none");
        $('#banktransferreceipt').css('display','none');
        $('#walletinputpin').val("");
        $('#inputAmt').val("");
        $('#inputpin').val("");
        $('#walletinputpin1').val("");

        $("#dashboardpage").css("display", "block");
    });


    $('#userid').html(localStorage.getItem('username'));

   

    //bank balance
    let bank_balance = 100000;
    let wallet_balance=0;
    let pin = 123456;

    $('#balance_submit').click(() => {
        console.log('helloo');
        console.log($('#inputpin').val(), pin)
        if ($('#inputpin').val() == pin) {
            $('#displaybalance').html("Your Bank Account Balance is :  Rs." + bank_balance);
            $('#verifypin').html("");
            $('#audiobankbalance').val();

                const audio = new Audio("./audio/Paytm transaction tune.mp3" );
                audio.play();
                
        }
        else {
            $('#verifypin').html("Pin not Match");
            $('#displaybalance').html("");
            const audio = new Audio("./audio/microsoft-windows-xp-error-sound-effect-hd_fbJzA8od.mp3" );
            audio.play();
            
        }
    });

    /*     $('#divBankBalance').click(()=>{
            $('#displaybalance').html("");
            $('#verifypin').html("");
        });  
        ./audio/Phone pay Transaction Done Sound.mp3">
						./audio/Center fruit final 45 sec.mov.mp3">
						./audio/Microsoft Windows XP Error - Sound Effect (HD).mp3">
        
        */






    $('#walletrechargesubmit').click(() => {
       
        
        if ($('#walletinputpin').val() == pin && $('#inputAmt').val()>0 && $('#inputAmt').val()<=bank_balance) {
            let rechargeamt=$('#inputAmt').val();
            wallet_balance=parseFloat(wallet_balance)+parseFloat(rechargeamt);
            bank_balance=parseFloat(bank_balance)-parseFloat(rechargeamt);
            
            $('#displaywalletbalance').html(" Wallet Recharge of Rs." + rechargeamt+ " is Successful");
            $('#walletverifypin').html("");
            
            const audio = new Audio("./audio/Paytm transaction tune.mp3" );
            audio.play();
           
        }
        else {
            if(parseInt($('#inputAmt').val())<0 || $('#inputAmt').val()>bank_balance)
            {
                $('#walletverifypin').html("Invalid Amount");
                $('#displaywalletbalance').html("");

            }
            else{
            $('#walletverifypin').html("Pin not Match");
            $('#displaywalletbalance').html("");
            }
            const audio = new Audio("./audio/microsoft-windows-xp-error-sound-effect-hd_fbJzA8od.mp3" );
            audio.play();


        }
    });

   
    $('#walletbalsubmit').click(() => {
        if ($('#walletinputpin1').val() == pin){
            $('#diswalletbalance').html("Your wallet balance is : Rs." + wallet_balance );
            $('#walletverifypin1').html("");
            const audio = new Audio("./audio/Paytm transaction tune.mp3" );
            audio.play();
        }
        else
        {
            $('#walletverifypin1').html("Pin not Match");
            $('#diswalletbalance').html("");
            const audio = new Audio("./audio/microsoft-windows-xp-error-sound-effect-hd_fbJzA8od.mp3" );
            audio.play();
        }
        



    });

    $("#formsubmit").click(() => {
        
        if($('#feedbackname').val()!=="" && $("#feedbackemail").val()!=="" && $("#addTxt").val()!=="" ){
            addfeedback();
           alert('Submitted Successfuly')
            }
            else{
                alert('Add Information')
            }
        
    });

    $('#Reviews').click(()=>{
        showReview();
    });

    $('#banktransfersubmit').click(()=>{
        $('#banktransferreceipt').css('display','block');
        $('#divBankTransfer').css('display','none');
           const audio = new Audio("./audio/Paytm transaction tune.mp3" );
            audio.play();
        
    });




}); //end of Domcontentloaded


function preventBack() { window.history.forward(); }

setTimeout("preventBack()", 0);
window.onunload = function () { null };



    // Function to show elements from localStorage
    function showReview() {
        console.log('hello reviews');
        let arr=localStorage.getItem('feedback_details');
        arr=JSON.parse(arr);
        let html='';
        for (let index = 0; index < arr.length; index++) {
            let tempname=arr[index].fname;
            let tempmsg=arr[index].fmessage;
            console.log(tempmsg,tempname)
            html+=`<div class="col-sm-6 col-md-3 m-3 d-flex justify-content-center" id="addfeedback" ">
            <div class="card" style="background-image: linear-gradient(to bottom right, #FDFCFB, #E2D1C3);">
              <div class="card-body  " >
                <h5 class="card-title" id="cardName">Review ${index+1}</h5>
                <h5 class="card-title" id="cardName">${tempname}</h5>
                <p class="card-text d-flex flex-wrap" id="cardMsg">${tempmsg}</p>
                
              </div>
            </div>
          </div>`
          
            
        }
        if(arr.length!=0){

        $("#addfeedback").html(html);
        }
        else{
            $("#addfeedback").html("Nothing to show");
        }
      }


     


