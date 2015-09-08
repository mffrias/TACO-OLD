package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import org.junit.Test;

public class BallotTest_Ballot_0 {

    /**
     * Auxiliar function that embed awful reflection code
     * 
     * @param instance
     * @param fieldName
     * @param value
     */
    private void updateValue(Object instance, String fieldName, Object value) {
        for (Field aField : instance.getClass().getDeclaredFields()) {
            if (aField.getName().equals(fieldName)) {
                try {
                    aField.setAccessible(true);
                    if (aField.getType().isPrimitive()) {
                        String typeSimpleName = aField.getType().getSimpleName();
                        if (typeSimpleName.equals("boolean")) {
                            aField.setBoolean(instance, (Boolean) value);
                        } else if (typeSimpleName.endsWith("byte")) {
                            aField.setByte(instance, (Byte) value);
                        } else if (typeSimpleName.endsWith("char")) {
                            aField.setChar(instance, (Character) value);
                        } else if (typeSimpleName.endsWith("double")) {
                            aField.setDouble(instance, (Double) value);
                        } else if (typeSimpleName.endsWith("float")) {
                            aField.setFloat(instance, (Float) value);
                        } else if (typeSimpleName.endsWith("int")) {
                            aField.setInt(instance, (Integer) value);
                        } else if (typeSimpleName.endsWith("long")) {
                            aField.setLong(instance, (Long) value);
                        } else if (typeSimpleName.endsWith("short")) {
                            aField.setShort(instance, (Short) value);
                        } else {
                            System.out.println("ERROR: No difinida");
                        }
                    } else {
                        aField.set(instance, value);
                    };

                    aField.setAccessible(false);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Auxiliar function that embed awful reflection code
     * 
     * @param className
     * @param constructorName
     * @param value
     */
    private Constructor<?> getAccessibleConstructor(String className, String methodName, boolean value) {
        Class<?> clazz;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        }

        Constructor<?> consToCheck = null;
        try {
            // Gets parameters types
            Class<?>[] parameterTypes = null;
            for (Constructor<?> aMethod: clazz.getConstructors()) {
                if (aMethod.getName().equals(methodName)) {
                    parameterTypes = aMethod.getParameterTypes();
                }
            }
            consToCheck = clazz.getConstructor(parameterTypes);
        } catch (SecurityException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        }
        consToCheck.setAccessible(value);

        return consToCheck;
    }/**
     * Auxiliar function that embed awful reflection code
     * 
     * @param className
     * @param methodName
     * @param value
     */
    private Method getAccessibleMethod(String className, String methodName, boolean value) {
        Class<?> clazz;
        try {
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        }

        Method methodToCheck = null;
        try {
            // Gets parameters types
            Class<?>[] parameterTypes = null;
            for (Method aMethod: clazz.getDeclaredMethods()) {
                if (aMethod.getName().equals(methodName)) {
                    parameterTypes = aMethod.getParameterTypes();
                }
            }
            methodToCheck = clazz.getDeclaredMethod(methodName, parameterTypes);
        } catch (SecurityException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("DYNJALLOY ERROR! " + e.getMessage());
        }
        methodToCheck.setAccessible(value);

        return methodToCheck;
    }

    @Test
    public void testBallot_0() {
        ie.koa.Ballot instance = new ie.koa.Ballot();
        int[] _int_array_1 = new int[0];
        int[] _int_array_2 = new int[1];
        
        // Statics Fields Initialization
        // Fields Initialization for 'instance'
        updateValue(instance, "ballotID", 7961339377880656879L);
        updateValue(instance, "candidateID", 0L);
        updateValue(instance, "preferenceList", _int_array_1);
        updateValue(instance, "numberOfPreferences", 0);
        updateValue(instance, "positionInList", 0);
        updateValue(instance, "candidateIDAtCount", _int_array_2);
        _int_array_2[0] = 0;
        updateValue(instance, "countNumberAtLastTransfer", 0);
        updateValue(instance, "randomNumber", 538051161);
        updateValue(instance, "SystemcurrentTimeMillis", 536870913);
        updateValue(instance, "MAX_POSSIBLE_BALLOTS", 1);
        updateValue(instance, "NONTRANSFERABLE", 0L);
        updateValue(instance, "MAXIMUM_ROUNDS_OF_COUNTING", 1);
        updateValue(instance, "uniqueID", 1);
        
        // Method Invocation
        Constructor<?> method = getAccessibleConstructor("ie.koa.Ballot", "Ballot", true);
        try {
            instance = (ie.koa.Ballot) method.newInstance(null);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}