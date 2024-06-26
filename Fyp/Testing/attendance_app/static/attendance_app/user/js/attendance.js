
document.addEventListener("DOMContentLoaded", () => {
    const form = document.forms[0];
    const startDateInput = document.getElementById("start-date");
    const endDateInput = document.getElementById("end-date");
    const error = document.getElementById("error");
    error.style.textAlign = "center";
    error.style.color = "red";
    
    // Get the current date in mm/dd/yyyy format
    const today = new Date().toLocaleDateString().padStart(9, "0");

    form.addEventListener("submit", (event) => {
        event.preventDefault(); // stop the form from submitting

        if (startDateInput.value == "" && endDateInput.value == "") {
            form.submit();
            return;
            // error.innerHTML = "Both fields are requireds ";
            // return;
        }
        error.innerHTML = "";
        if (startDateInput.value != "")
        {
            if (new Date(startDateInput.value).toLocaleDateString().padStart(9,"0") > today ) {
            error.innerHTML = "Start date cannot be after today  date " + today;
            error.style.backgroundColor ="#f2f2f2"
            return;

        }
        }

        error.innerHTML = "";
        error.backgroundColor = "#333";

        // if (( new Date(endDateInput.value).toLocaleDateString().padStart(9,"0")) > today) {
        //     error.innerHTML = "End date cannot be after today date " + today;
        //     return;

        // }
        // error.innerHTML = "";

        if (endDateInput.value != "")
        {
        if (startDateInput.value > endDateInput.value) {
            error.innerHTML = "End date cannot be before start date!";
            error.style.backgroundColor ="#f2f2f2"
            return;
        }
    }
    error.innerHTML = "";
    error.backgroundColor = "#333";


        form.submit();
    });
});