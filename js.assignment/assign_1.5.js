var year= 0;
var currentYear=2021;
function leapyears() {
    while (year< 20) { 
        if ((currentYear % 4===0) && (!((currentYear % 100===0) && (currentYear % 400 !== 0)))) {
            document.write(currentYear + "<br>");
            year++;
            currentYear++;
        } else {
            currentYear++;
        }
    }       
}
leapyears();