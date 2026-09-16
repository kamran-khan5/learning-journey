import java.util.Scanner;

public class Chap_6_31 {
    private int accumulator;
    private int[] memory;
    private int instructionRegister;
    private int instructionCounter;
    private int operationCode;
    private int operand;

    public Chap_6_31() {
        displayWelcomeMessage();
        initialiseVariables();

    }


    public void displayWelcomeMessage() {
        System.out.printf("\n%s\n%s\n%s\n%s\n%s\n%s\n%s\n%s %s\n%s %s\n",
                "*** Welcome to Simpletron! ***",
                "*** Please enter your program one instruction ***",
                "*** (or data word) at a time into the input   ***",
                "*** text field. I will display the location   ***",
                "*** number and a question mark (?). You then  ***",
                "*** type the word for that location. Press the***",
                "*** Done button to stop entering your program ***",
                " Loc", " Inst", "****", "*****");
    }


    public void runSimulator() {
        int submittedInstruction = 0;
        int memoryPointer = 0;

        Scanner input = new Scanner(System.in);

        do {
            System.out.printf("%d %s  ", memoryPointer, "?");
            submittedInstruction = input.nextInt();
            if (submittedInstruction != -99999)
                memory[memoryPointer] = submittedInstruction;
            memoryPointer++;

        } while (submittedInstruction != -99999);

        System.out.printf("\n%s%s", "*** Program loading completed ***\n",
                "*** Program excecution begins  ***\n");


        for (int code : memory) {
            if (code != 0)
            {
                load();
                execute(operand, operationCode);
            }
        }

    }

    public void initialiseVariables() {
        memory = new int[100];
        instructionCounter = 0;

    }
    public void load() {

        operationCode = memory[instructionCounter] / 100;
        operand = memory[instructionCounter] % 100;

    }


    public void execute(int operands, int operation) {

        switch (operation) {
            case 10:
                Scanner input = new Scanner(System.in);
                System.out.print("Please Enter a whole number (positive or negative): ");
                memory[operands] = input.nextInt();
                break;
            case 11:
                System.out.println("The result of the operation is " + memory[operands]);
                break;
            case 20:
                accumulator = memory[operands];
                break;
            case 21:
                memory[operands] = accumulator;
                break;
            case 30:
                accumulator += memory[operands];
                break;
            case 31:
                accumulator -= memory[operands];
                break;
            case 32:
                accumulator /= memory[operands];
                break;
            case 33:
                accumulator *= memory[operands];
                break;
            case 40:
                instructionCounter = operands;
                break;
            case 41:
                if (accumulator < 0)
                    instructionCounter = operands;
                break;
            case 42:
                if (accumulator == 0)
                    instructionCounter = operands;
                break;
            case 43:
                dumpTheCore();

                System.out.printf("\n%s\n", "The program has ended...");
                System.exit(0);
                break;

        }
        instructionCounter++;
    }


    public void dumpTheCore() {
        System.out.printf("\n%30s\n%30s\t%s%4d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n%30s\t%2d\n\n%30s\n", "REGISTERS:",
                "accumulator", "+", accumulator, "instruction counter", instructionCounter, "instruction register",
                instructionCounter, "operation code", operationCode, "operand", operand, "MEMORY:");


        for (int i = 0; i < 10; i++) {
            System.out.printf("%6d", i);
        }

        System.out.println();
        int counter = 0;

        for (int i = 0; i < 10; i++) {
            if (counter % 10 == 0)
                System.out.printf("%2d ", counter);
            for (int j = 0; j < 10; j++) {

                if (memory[counter] == 0)
                    System.out.printf("%s%s", "+", "0000 ");
                else
                    System.out.printf("%s%4d ", "+", memory[counter]);
                counter++;

            }

            System.out.println();

        }
    }
}
