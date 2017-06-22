function login()
{
	var userName = document.getElementById("username").value;
	var msg = ' Hello ' + userName + ' authentication successful ..';
}

function submitApp()
{
	var xmlhttp = new XMLHttpRequest();
	var url = "http://ctspsd2.eu-gb.mybluemix.net/provide/mortgagelist";
	xmlhttp.onreadystatechange = function()
	{
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var arr = JSON.parse(xmlhttp.responseText);
			var out = "<table class=\"zui-table\">";
			out += "<tr><td>"
					+ arr[0].status1
					+ "</td><td>"
					+ "<img src=\"images/tick.png\">"
					+ "</td></tr>"
					+ "<tr><td>"
					+ arr[0].status2
					+ "</td><td>"
					+ "<img src=\"images/tick.png\">"
					+ "</td></tr>"
					+ "<tr><td>"
					+ arr[0].status3
					+ "</td><td>"
					+ "<img src=\"images/tick.png\">"
					+ "</td></tr>"
					+ "<tr><td>"
					+ arr[0].status4
					+ "</td><td>"
					+ "<img src=\"images/tick.png\">"
					+ "</td></tr>"
					+ "<tr><td>"
					+ arr[0].status5
					+ "</td><td>"
					+ "<img src=\"images/tick.png\">"
					+ "</td></tr>"
					+ "<tr><td>"
					+ arr[0].status6
					+ "</td><td>"
					+ "<img src=\"images/tick.png\">"
					+ "</td></tr>"
					+ "<tr><td>AIP Approved</td><td>"
					+ "<a href=\"http://www.newbury.co.uk/media/30479/broker-aip-form.pdf\">Download</a>"
					+ "</td></tr>"
			out += "</table>";
			document.getElementById("demo").innerHTML = out;
		}
	};
	xmlhttp.open("GET", url, true);
	xmlhttp.send();
}

function getAC()
{
	var xmlhttp = new XMLHttpRequest();
	var url = "http://ctspsd2.eu-gb.mybluemix.net/provide/ac";
	xmlhttp.onreadystatechange = function() {
		if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
			var res = "<font color=\"#0E1546\" size =\"4\" face=\"verdana\">Based on the details given- <br> "
					+ "<label><input type=\"radio\" onclick=\"showAIP(1)\" name=\"bank1\">"
					+ "RBS could lend you up to: £"
					+ xmlhttp.responseText
					+ "</font> <br>"
					+ "<input type=\"radio\" onclick=\"showAIP(2)\" name=\"bank1\"> <font color=\"#0E1546\" size =\"4\" face=\"verdana\">HSBC could lend you up to: £303800 </font>  <br> "
					+ "<input type=\"radio\" onclick=\"showAIP(3)\" name=\"bank1\"><font color=\"#0E1546\" size =\"4\" face=\"verdana\">Barclays could lend you up to: £303500 </font> </label>";

			document.getElementById("getac").innerHTML = res;

		}
	};
	xmlhttp.open("GET", url, true);
	xmlhttp.send();
}

function showAIP(b_id)
{
	if (b_id == 1)
		document.getElementById("AIP").innerHTML = "<a href=\"about.html\" class=\"readmore\" >Get Agreement in Principle from RBS</a>";
	else if (b_id == 2)
		document.getElementById("AIP").innerHTML = "<a href=\"about.html\" class=\"readmore\" >Get Agreement in Principle from HSBC</a>";
	else if (b_id == 3)
		document.getElementById("AIP").innerHTML = "<a href=\"about.html\" class=\"readmore\" >Get Agreement in Principle from Barclays</a>";
}

function openModal()
{
	document.getElementById('modal').style.display = 'block';
	document.getElementById('fade').style.display = 'block';
	document.getElementById('prasad').style.display = 'block';
}

function closeModal()
{
	document.getElementById('modal').style.display = 'none';
	document.getElementById('fade').style.display = 'none';
	document.getElementById('prasad').style.display = 'none';

}

function statementsTrue()
{
	openModal();
	var xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			closeModal();
			var arr = JSON.parse(xhttp.responseText);
			var out = "<p><font color=\"#0E1546\" size =\"3\" face=\"verdana\">Congratulations!! Prasad, we just found out you are a 'bluebank customer', get easy access to Agreement in Principle (AIP) by following below steps..</font> </p><table class=\"zui-table\"><tr><th>Sort Code</th><th>Account Number</th><th>Balance £</th></tr>";
			for (i = 0; i < arr.length; i++) {
				out += "<tr><td>" + arr[i].sortCode + "</td><td>"
						+ arr[i].accountNumber + "</td><td>"
						+ arr[i].accountBalance + "</td></tr>";
			}
			out += "</table>";

			document.getElementById("account").innerHTML = out;
			document.getElementById('prasad').style.display = 'block';

		}
	};
	xhttp
			.open(
					"GET",
					"https://bluebank.azure-api.net/api/v0.6.3/customers/57530d076e7a1b691b70ca40/accounts",
					true);
	xhttp.setRequestHeader("Ocp-Apim-Subscription-Key",
			"406652a3a4064b84b6bbc70bbf9cfb18");
	xhttp
			.setRequestHeader(
					"bearer",
					"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjdXN0b21lcklkIjoiNTc1MzBkMDc2ZTdhMWI2OTFiNzBjYTQwIiwicm9sZSI6InVzZXIiLCJwcmltYXJ5U3Vic2NyaWJlcktleSI6IjQwNjY1MmEzYTQwNjRiODRiNmJiYzcwYmJmOWNmYjE4IiwiaWF0IjoxNDY1MDY0ODI0fQ.LvPcN8qDnpGNYcwgDTDSXTFQomuiUfKli9DlnoPW-bs");
	xhttp.send();
}

function statementsFalse()
{
	document.getElementById("account").innerHTML = 'Thanks for visiting our site..';
	closeModal();

}
