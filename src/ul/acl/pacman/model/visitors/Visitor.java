package ul.acl.pacman.model.visitors;

import java.lang.reflect.Method;

/**
 * Created by Nicolas on 24/11/15.
 */
public abstract class Visitor {

    abstract public void visit( Object o );


    // 1. Look for visitElementClassName() in the current class
    // 2. Look for visitElementClassName() in superclasses
    // 3. Look for visitElementClassName() in interfaces
    // 4. Look for visitObject() in current class
    protected Method getMethod(Class c ) {
        Class  newc = c;
        Method m    = null;
        while (m == null  &&  newc != Object.class) {
            String method = newc.getName();
            method = "visit" + method.substring( method.lastIndexOf('.') + 1 );
            try {
                m = getClass().getMethod( method, new Class[] { newc } );
            } catch (NoSuchMethodException ex) {
                newc = newc.getSuperclass();
            }
        }
        if (newc == Object.class) {
            // System.out.println( "Searching for interfaces" );
            Class[] interfaces = c.getInterfaces();
            for (int i=0; i < interfaces.length; i++) {
                String method = interfaces[i].getName();
                method = "visit" + method.substring( method.lastIndexOf('.') + 1 );
                try {
                    m = getClass().getMethod( method, new Class[] { interfaces[i] } );
                } catch (NoSuchMethodException ex) { }
            }
        }
        if (m == null)
            try {
                m = getClass().getMethod( "visitObject", new Class[] { Object.class } );
            } catch (Exception ex) { }
        return m;
    }

}
