package org.intellij.sequencer;

import org.intellij.sequencer.generator.filters.CompositeMethodFilter;
import org.intellij.sequencer.generator.filters.MethodFilter;

import java.util.List;

/**
 * &copy; fanhuagang@gmail.com
 * Created by van on 2020/4/12.
 */
public interface SequenceNavigable {
    void openClassInEditor(String className);

    void openMethodInEditor(String className, String methodName, List<String> argTypes);

    boolean isInsideAMethod();

    void openMethodCallInEditor(MethodFilter filter, String fromClass, String fromMethod, List<String> fromArgTypes,
                                String toClass, String toMethod, List<String> toArgType, int callNo);

    List<String> findImplementations(String className);

    List<String> findImplementations(String className, String methodName, List<String> argTypes);

    void openLambdaExprInEditor(String fromClass, String fromMethod, List<String> fromArgTypes, List<String> argTypes, String returnType);

    void openMethodCallInsideLambdaExprInEditor(CompositeMethodFilter methodFilter, String fromClass, String enclosedMethodName, List<String> enclosedMethodArgTypes,
                                                List<String> argTypes, String returnType,
                                                String toClass, String toMethod, List<String> toArgTypes, int callNo);
}
