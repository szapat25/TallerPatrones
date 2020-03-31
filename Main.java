import java.util.*;

public class Main{
    public static void main(final String[] args){
        FacturaDaoImpl fdi = new FacturaDaoImpl();
        List<Item> itemfac = new ArrayList<Item>();
        Datos db = new Datos();
        String nombre, apellidos, gen, fechana, ecivil, idclst, aid, cid, vid;
        String idcliente = "CL";
        int idcl = 0, op, aseoid = 0, comidaid = 0, variosid = 0, total = 0, carrito = 0;
        idclst = String.valueOf(idcl);
        aid = String.valueOf(aseoid);
        cid = String.valueOf(comidaid);
        vid = String.valueOf(variosid);
        Cliente cliente;
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int nrof = (int) Math.floor(Math.random() * (999 - 100 + 1) + 100);

        System.out.println("Bienvenido a tiendas Pattern, regístrese para comenzar a comprar.");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Apellidos: ");
        apellidos = sc.nextLine();
        System.out.print("Género: ");
        gen = sc.nextLine();
        System.out.print("Fecha de nacimiento (DD/MM/AAAA): ");
        fechana = sc.nextLine();
        System.out.print("Estado civil: ");
        ecivil = sc.nextLine();
        cliente = new Cliente(idcliente + idclst, nombre, apellidos, gen, fechana, ecivil);
        db.addClienteDB(cliente);
        System.out.println("Usuario registrado con éxito.");

        while(salir != true){
            System.out.println("¿Qué producto desea agregar al carrito? (PRODUCTOS EN EL CARRITO: " + String.valueOf(carrito) + ")\n1. Producto de aseo.\n2. Comida.\n3. Producto vario.\n0. Terminar compra.");
            op = sc.nextInt();
            if(op > 3 || op < 0){
                System.out.println("Debe seleccionar una opción.");
                carrito--;
            }
            switch(op){
                case 1:
                    Item itemaseo = new Item("ASEO", "ASEO" + aid, "Este es un artículo de aseo", 2000);
                    itemfac.add(itemaseo);
                    break;
                case 2:
                    Item itemcomida = new Item("COMIDA", "COMIDA" + cid, "Este es un artículo de comida", 1500);
                    itemfac.add(itemcomida);
                    break;
                case 3:
                    Item itemvarios = new Item("VARIOS", "VARIOS" + vid, "Este es un artículo de varios", 900);
                    itemfac.add(itemvarios);
                    break;
                case 0:
                    salir = true;
                    break;                
            }
            carrito++;
        }

        for(Item i : itemfac){
            total+=i.getValorunitario();
        }

        Factura fac = new Factura(nrof, "31/03/2020", cliente, total, "Pagado", itemfac);
        db.addFacturaDB(fac);
        fdi.addFactura(fac);
        System.out.println("Gracias por su compra. Su factura es:\n" + fac);
        sc.close();
    }
}