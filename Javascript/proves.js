let imatge = document.getElementById("mena1");

imatge.style.height = "96px";
imatge.style.width = "48px";

//------------------

let moviment = document.getElementById("mena1");

const newspaperTiming = {
    duration: 1000,
    iterations: Infinity
};

const newspaperSpinning = [
    { marginTop: "100px" },
    { marginTop: "9px" },
    { marginTop: "100px" }
];

//moviment.animate(newspaperSpinning, newspaperTiming);

//---------------------------------------------

$("#cub").on("mouseenter", function (event) {
    $('#cub').css('color', 'black');
});

$("#cub").on("mouseleave", function (event) {
    $('#cub').css('color', 'white');
});