class Calculator {
    public  calculate(num1: number, num2: number): void{};
    public static calculateTest(num1: number, num2: number, type: string) 
{
        let objs: Calculator[] = new Array();
        objs[0] = new Addtion();
        objs[1] = new Mul();
        let [add, mul] = objs;
        let obj = eval(type);
        obj.calculate(num1, num2);
    }
}
class Addtion extends Calculator {
    public calculate(num1: number, num2: number): void {
        console.log(num1 + num2);
    }
}
class Mul extends Calculator {
    public calculate(num1: number, num2: number): void {
        console.log(num1 * num2);
    }
}
Calculator.calculateTest(5, 7, "mul");
Calculator.calculateTest(5, 7, "add");
