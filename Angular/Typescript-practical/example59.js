function PrintList(obj) {
    for (var property in obj) {
        console.log(property + " : " + obj[property]);
    }
}
PrintList({ Name: 'TV', Price: 45000 });
