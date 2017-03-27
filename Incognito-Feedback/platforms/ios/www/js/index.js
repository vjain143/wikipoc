var pagesHistory = [];
var currentPage = {};
var path = "";

function init()
{

    $("body").load(path + "pages/index.html", function()
    {
        $.getScript(path + "js/index.js", function()
        {
            if (currentPage.init)
            {
                currentPage.init();
            }
        });
    });
}
