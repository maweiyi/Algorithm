/**
 * Created by MWY on 10/2/16.
 */
function Person(name, age, job) {
    this.name = name;
    this.age = age;
    this.job = job;
}


Person.prototype = {
    constructor: Person,
    sayName: function () {
        console.log(this.name);
    }
};

var person1 = new Person("MWY", 21, "Software Engineer");
var person2 = new Person("XXX", 222, "KK");


person1.sayName();
person2.sayName();