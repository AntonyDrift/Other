package com.company;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import sun.reflect.Reflection;
import sun.reflect.misc.ReflectUtil;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

public class ClassAnalyzer {
    int aa = 10;
    double bb = 20;


    public ClassAnalyzer(int aa, double bb) {
        this.aa = aa;
        this.bb = bb;
    }

    public static void main(String[] args) throws IllegalAccessException {

        ClassAnalyzer aboutReflection = new ClassAnalyzer(10, 20);

        aboutReflection.ReflectionAboutClass();
        aboutReflection.ReflectionAboutConstructors();
        aboutReflection.ReflectionAboutFields();
        aboutReflection.ReflectionAboutMethods();
        aboutReflection.ReflectionAboutAnnotation();

    }

    public void ReflectionAboutClass() {

        Class c = Pair.class;//Create class object

        Package aPackage = c.getPackage();
        System.out.println("Info about package: " + aPackage);


        String nameClass = c.getSimpleName();//Print name class
        System.out.println(("Name class: " + nameClass));

        String nameSuperClass = c.getSuperclass().getSimpleName();//Print name superclass
        System.out.println("Superclass name: " + nameSuperClass);

        int classModifiers = c.getModifiers();//Print modifiers class
        System.out.println("Modifiers of class: " + Modifier.toString(classModifiers));

        Class[] interfaces = c.getInterfaces();//Print interface class
        for (Class inferfaceClass : interfaces) {
            System.out.println("Implemented interfaces are: " + inferfaceClass.getSimpleName() + " ");
        }
        System.out.println("-----------------------");
    }

    public void ReflectionAboutConstructors() {

        Class c = Pair.class;//Create class object

        Constructor[] constructors = c.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.toString());

            Class[] constructorParam = constructor.getParameterTypes();
            for (Class class1 : constructorParam) {
                System.out.println("Parametres constructor: " + class1.getSimpleName() + " ");
            }
            Class[] constructorException = constructor.getExceptionTypes();
            for (Class class1 : constructorException) {
                System.out.println("Exception constructors by " + class1.getSimpleName());
            }
        }
        System.out.println("--------------------");
    }

    public void ReflectionAboutFields() throws IllegalArgumentException, IllegalAccessException {

        Class c = Pair.class;//Create class object

        Field[] field = c.getDeclaredFields();
        for (Field field1 : field) {
            int fieldMods = c.getModifiers();
            System.out.println("Name " + field1.getName() + "; Type " + field1.getType()
                    + "; Modifiers " + Modifier.toString(fieldMods));
        }
        System.out.println("--------------------");
    }

    public void ReflectionAboutMethods() {

        Class c = Pair.class;//Create class object

        Method[] method = c.getDeclaredMethods();

        int methodMods = c.getModifiers();
        for (Method method1 : method) {
            System.out.println("Name " + method1.getName() + "; Type " + method1.getReturnType()
                    + "; Modifiers " + Modifier.toString(methodMods));

            Class[] methodParam = method1.getParameterTypes();

            for (Class class1 : methodParam) {
                System.out.println("Parametres methods: " + class1.getSimpleName() + " ");
            }
            Class[] methodException = method1.getExceptionTypes();
            for (Class class1 : methodException) {
                System.out.println("Exception methods by " + class1.getSimpleName());
            }
        }

        System.out.println("--------------------");
    }

    public void ReflectionAboutAnnotation() {

        try {
            Class c = PairUtil.class;//Create class object
            Method m = c.getMethod("swap", Pair.class);
            Transaction annotation = m.getAnnotation(Transaction.class);
            System.out.println(annotation);

        } catch (NoSuchMethodException e) {
            System.out.println("method not found");
            ;
        }


    }
}
