package ar.edu.generated.junit;

import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import org.junit.Test;

public class AvlTreeTest_findMin_0 {

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
    public void testfindMin_0() {
        roops.core.objects.AvlTree instance = new roops.core.objects.AvlTree();
        roops.core.objects.AvlNode _AvlNode_1 = new roops.core.objects.AvlNode();
        roops.core.objects.AvlNode _AvlNode_2 = new roops.core.objects.AvlNode();
        // Fields Initialization for 'instance'
        // Fields Initialization for '_AvlNode_1'
        // Fields Initialization for '_AvlNode_2'
        updateValue(_AvlNode_2, "left", null);
        updateValue(_AvlNode_2, "right", null);
        updateValue(_AvlNode_2, "key", 0);
        updateValue(_AvlNode_2, "height", 0);
        updateValue(_AvlNode_1, "left", _AvlNode_2);
        updateValue(_AvlNode_1, "right", null);
        updateValue(_AvlNode_1, "key", 1724820475);
        updateValue(_AvlNode_1, "height", 1);
        updateValue(instance, "root", _AvlNode_1);
        updateValue(instance, "size", 2);
        
        // Method Invocation
        Method method = getAccessibleMethod("roops.core.objects.AvlTree", "findMin", true);
        try {
            method.invoke(instance, null);
        } catch (Exception e) {
            e.printStackTrace();
        } 

    }
}