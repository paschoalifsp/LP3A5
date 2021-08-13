package exercicio1;

import java.lang.reflect.*;

public class Reflexao {
	
	public static void refletirObjeto (Object obj, Class classe) throws IllegalArgumentException, IllegalAccessException {
		System.out.println("Nome da classe:" + classe.getName());
		System.out.println("Nome canonical: " + classe.getResource(classe.getName()));
		System.out.println("tipo: " + classe.getTypeName());
		
		Field[] atributos = classe.getDeclaredFields();
		
		for(Field F: atributos) {
			
			F.setAccessible(true);
			if(F.getType().isPrimitive())
				F.set(obj, 0);
	
			System.out.println(F.getName() + ": " + F.getType().getTypeName());
		}
		
		Method[] metodos = classe.getDeclaredMethods();
		
		for(Method M: metodos) {
			System.out.println(M.getName());
		}
		
		
	}
	
	
	
}