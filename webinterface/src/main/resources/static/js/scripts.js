/**
 * Javascript functions.
 */
$(document).ready(function() {
    if ($('#logout-button').length) {
        $("#logout-button").on("click", function (event) {
            event.preventDefault();
            $('#menu-form').attr('action', "/logout");
            $("#menu-form").submit();
        });
    }
    if ($('#rules-button').length) {
        $("#rules-button").on("click", function (event) {
            event.preventDefault();
            $('#menu-form').attr('action', "/rules");
            $("#menu-form").submit();
        });
    }
    if ($('#consultancy-button').length) {
        $("#consultancy-button").on("click", function (event) {
            event.preventDefault();
            $('#menu-form').attr('action', "/consultancy");
            $("#menu-form").submit();
        });
    }
    if ($('#industprocess-button').length) {
        $("#industprocess-button").on("click", function (event) {
            event.preventDefault();
            $('#menu-form').attr('action', "/industprocess");
            $("#menu-form").submit();
        });
    }
});