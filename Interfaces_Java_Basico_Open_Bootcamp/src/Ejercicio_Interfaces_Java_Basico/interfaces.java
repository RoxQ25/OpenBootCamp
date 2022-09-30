package Ejercicio_Interfaces_Java_Basico;

public class interfaces {
	public interface CocheCRUD {

			void save ();
			void findAll ();
			void delete ();
		}

		public static class CocheCRUDIMP1 implements CocheCRUD {

			@Override
			public void save() {
			}

			@Override
			public void findAll () {
			}

			@Override
			public void delete() {
			}

			String save = "Guardando";
			String findAll = "Buscando todo";
			String delete = "Borrando";

			@Override
			public String toString () {
				return "CocheCRUDImp1" +
						"save=" + save +
						", find all=" + findAll +
						", delete=" + delete;
		}
	}

	public static void main(String[] args) {

		CocheCRUD cocheCRUD = new CocheCRUDIMP1();
		System.out.println(cocheCRUD);
	}

}
