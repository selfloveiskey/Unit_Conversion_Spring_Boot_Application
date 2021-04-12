function customTempReset() {
    document.getElementsByName("temp_conversion_form").reset();
}

function customVolReset() {
    document.getElementsByName("volume_conversion_form").reset();
}

function validateForm() {

    // required form fields
    var convertFrom,
        convertFromInput,
        convertTo,
        studentResponseInput,
        validNonDecimalInputValue = 0,
        validNonDecimalStringInputValue = "0.0",
        validDecimalStringInputValue = "0";

    // Get the value of required form fields with id="some value"
    convertFrom = document.getElementById("convertFrom").value;
    convertFromInput = document.getElementById("convertFromInput").value;
    convertTo = document.getElementById("convertTo").value;
    studentResponseInput = document.getElementById("studentResponseInput").value;

    // field validation
    if (convertFrom === "" ||
        convertFrom === '' ||
        convertFrom === "none" ||
        convertTo === "" ||
        convertTo === '' ||
        convertTo === "none"){

        alert("Select a dropdown value");

        return false;
    }
    else if (isNaN(convertFromInput) || convertFromInput === Infinity) {

        alert("Invalid temperature value");

        return false;
    }
    else if (isNaN(studentResponseInput) || studentResponseInput === Infinity){

        alert("Invalid temperature value in student response field");

        return false;
    }
    else if(convertFromInput <= validNonDecimalInputValue ||
            convertFromInput > validNonDecimalInputValue ||
            convertFromInput <= 0.00 ||
            convertFromInput > 0.00 ||
            convertFromInput === validNonDecimalStringInputValue ||
            convertFromInput === validDecimalStringInputValue) {

        return true;
    }
    else if(studentResponseInput <= validNonDecimalInputValue ||
            studentResponseInput > validNonDecimalInputValue ||
            studentResponseInput <= 0.00 ||
            studentResponseInput > 0.00 ||
            studentResponseInput === validNonDecimalStringInputValue ||
            studentResponseInput === validDecimalStringInputValue){

        return true;
    }
}