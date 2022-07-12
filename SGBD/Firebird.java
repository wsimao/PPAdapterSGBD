package SGBD;

public class Firebird implements SGBD {

    @Override
    public void typeAndDescription() {
        System.out.println("SGBG: Firebird");
        System.out.println("Perfil: Básico");
        System.out.println("Descrição: MultiUsuário mas com Banco de Dados de transações únicas");
        
    }

    
}
