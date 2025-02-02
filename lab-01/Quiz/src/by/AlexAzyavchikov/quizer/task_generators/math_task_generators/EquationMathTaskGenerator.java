package by.AlexAzyavchikov.quizer.task_generators.math_task_generators;

import by.AlexAzyavchikov.quizer.exceptions.NoTasksException;
import by.AlexAzyavchikov.quizer.tasks.math_tasks.EquationMathTask;
import by.AlexAzyavchikov.quizer.tasks.math_tasks.MathTask;

import java.util.EnumSet;

public class EquationMathTaskGenerator extends AbstractMathGenerator {
    public EquationMathTaskGenerator(double minNumber,
                                     double maxNumber,
                                     EnumSet<MathTask.Operator> operators) {
        this(minNumber, maxNumber, operators, 0);
    }

    public EquationMathTaskGenerator(double minNumber,
                                     double maxNumber,
                                     EnumSet<MathTask.Operator> operators,
                                     int precision) {
        super(minNumber, maxNumber, operators, precision);
    }

    public EquationMathTask generate() {
        if (operators.isEmpty()) {
            throw new NoTasksException("Cannot create task in EquationMathTaskGenerator: no operators were provided");
        }
        return new EquationMathTask(GenerateNumber(), GenerateOperator(), GenerateNumber(), getPrecision());
    }

}
