
function validate()
 {

const address = document.querySelector("#address");
const fatherName = document.querySelector("#father-name");
const fileUpload = document.querySelector("#file-upload");
const dob = document.querySelector("#dob");
const qualification = document.querySelector("#qualification");
const institute = document.querySelector("#institute");
const passingYear = document.querySelector("#passing-year");
const percentage = document.querySelector("#percentage");
const hobbies = document.querySelectorAll('input[type="checkbox"]');
const zipCode = document.querySelector("#zip-code");
  

if(address.value.trim==="")
{
    alert("Please enter your address");
    address.focus();
    return false;
}
  if (!address.value.trim().match(/[A-Z a-z 0-9]{15,70}/))
  {
    alert("Invalid address! Address Should contain Alphabets and number only pecial characters not allowed");
    address.focus();
    return false;
  }


  if (fatherName.value.trim()==="") {
    alert("Please enter your father's name");
    fatherName.focus();
     return false;
  }
  
  if (!fatherName.value.trim().match(/[A-Z a-z]{3,12}/))
  {
    alert("Invalid! Father Name should contain only Alphabets and should be between 3-12 characters");
    fatherName.focus();
     return false;
  }

  if(!fileUpload.files[0]){
    alert("Please upload the file");
    fileUpload.focus();
     return false;
  }

  if(fileUpload.files[0]){
    var fileType = fileUpload.files[0].type;
    var validFileTypes = ["image/jpeg", "image/png", "image/jpg"];
    if(validFileTypes.indexOf(fileType) < 0){
       alert("Invalid file type. Only jpeg, png, jpg files are allowed.");
       fileUpload.focus();
       return false;
    }
 }
 


  if (dob.value.trim()=== "" ) {
    alert("Please enter your DOB");
    dob.focus();
     return false;
  }
  var date = new Date(dob.value);

  if (isNaN(date.getTime())) {

    alert("Please enter correct DOB");
    dob.focus();
    return false;
  }

  
  if (qualification.value.trim()=== "") {
    alert("Please select your qualification");
    qualification.focus();
     return false;
  }

  if (institute.value.trim()==="") {
    alert("Please enter your institute/board name");
    institute.focus();
     return false;
  }
  if (institute.value.match(/[A-Z a-z]{3,20}/)) {
    alert("Please enter valid institute/board name");
    institute.focus();
     return false;
  }

  if (passingYear.value.trim()==="" ) {
    alert("Please enter your passing year");
    passingYear.focus();
     return false;
  }

  if (!passingYear.value.trim().match(/[1-2][0-9]{3}/)) {
    alert("Please enter valid passing year");
    passingYear.focus();
     return false;
  }


  if (percentage.value.trim()<0.0 || percentage.value.trim()>100.0 || percentage.value.trim()==="") {
    alert("Please enter your percentage");
    percentage.focus();
     return false;
  }


  let hobbiesSelected = false;
  hobbies.forEach(function (hobby) {
      if (hobby.checked) {
          hobbiesSelected = true;
      }
  });
  if (!hobbiesSelected) {
    alert("Please select at least one hobby");
    hobbies.focus();
     return false;
  }


  if (zipCode.value.trim() === "" ||zipCode.value.trim().length<5 ) {
    alert("Please enter your zip code");
    zipCode.focus();
     return false;
  }
  const zipregex = /[0-9]{5}/

  if (!zipCode.value.match(zipregex)) {
    alert("Please enter a valid zip code");
    zipCode.focus();
     return false;
  }
  return true;
 }