$(document).ready(function () {
    $('.leftmenutrigger').on('click', function (e) {
        $('.side-nav').toggleClass("open");
        e.preventDefault();
    });
});


$("a.logout").click(function () {

    $.get("logout")
        .done(function (data, textStatus, xhr) {
            window.location = window.origin + "/IShop/";
        })
        .fail(function () {
            alert("Can't logout");
        });
});


// ajax
// jquery

