

window.addEventListener('DOMContentLoaded', function () {
	"use strict";
	var radioBtns = Array.from(document.getElementsByClassName("radioColor")); 
	console.log(radioBtns);
	radioBtns.forEach(function (IterRadio, index) { 
		IterRadio.addEventListener("click", function () {
			console.log(radioBtns[index]);
			document.getElementById("colorText").textContent = IterRadio.value;
			document.body.style.backgroundColor = radioBtns[index].value.replace("_", "").toLowerCase();
		});
	});
	document.getElementById("radioCount").innerHTML = radioBtns.length;
});
