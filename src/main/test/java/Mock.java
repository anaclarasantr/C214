public class Mock implements Service{ //o mock "replica" as informações reais
    
    @Override
    public String busca(int id) { // retorna as informações diretamente
        if (id == 10){
            return ProfessorConst.CHRIS;
        }
        if (id == 20){
            return ProfessorConst.MARCELO;
        }
        if (id == 0){
            return ProfessorConst.ERRO;
        }
        return null;
    }
}
