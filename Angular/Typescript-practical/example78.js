var Play;
(function (Play) {
    Play[Play["Last"] = 0] = "Last";
    Play["Next"] = "Next Song";
    Play["Prev"] = "Previous Song";
    Play["First"] = "First Song";
})(Play || (Play = {}));
console.log("Last Value " + Play.Last);
console.log("Prev : " + Play.Prev);
