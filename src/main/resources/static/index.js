
$(function () {
    visAlleKinobillett()();
});




function sjekkInput() {
    console.log("test")
    if(document.getElementById("input-film").value === "" || document.getElementById("input-antall").value === "" || document.getElementById("input-fornavn").value === "" || document.getElementById("input-etternavn").value === ""
        || document.getElementById("input-telefonnummer").value === "" || document.getElementById("input-email").value === "") {
        console.log("test")
        alert("Alle eller noen av input feltene er tomme!");
    } else {
        reg();
    }

}

function reg() {
    const Kinobillett = {
        inputfilm : $("#input-film").val(),
        inputantall : $("#input-antall").val(),
        inputfornavn : $("#input-fornavn").val(),
        inputetternavn : $("#input-etternavn").val(),
        inputtelefonnummer : $("#input-telefonnummer").val(),
        inputemail : $("#input-email").val()
    };
    $.post("/lagre", Kinobillett, function(){
            visAlleKinobillett();
    });

    alert("Filmen har blitt lagret til databasen")
    setTimeout(function(){ location.reload() }, 2000);

}


function visAlleKinobillett(){
    $.get( "/hentAlle", function( billettene ) {
        formaterData(billettene);
    });
}

function formaterData(Kinobillettene){
    let ut="<table><tr><th>Film</th><th>Antall</th>";
    ut+="<th>Fornavn</th><th>Etternavn</th><th>Telefonnummer</th><th>Epost</th></tr>";
    for (let b of Kinobillett ){
        ut+="<tr><td>"+b.inputfilm+"</td><td>"+b.inputantall;
        ut+="<td>"+b.inputfornavn+"</td><td>"+b.inputetternavn+"</td><td>"+b.inputtelefonnummer+"</td><td>"+b.inputemail;
        ut+="</td></tr>";
    }
    $("#alleBillettene").html(ut);
}




function slettBiletter() {
    const b = {
        inputfilm : null,
        inputantall : null,
        inputfornavn : null,
        inputetternavn : null,
        inputtelefonnummer : null,
        inputemail : null
    }
    $.get("slettAlle", b);
    alert("Sletter alle biletter")
    setTimeout(function(){ location.reload() }, 2000);
}