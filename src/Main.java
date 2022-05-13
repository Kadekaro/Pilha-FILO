public class Main {
    public static void main(String[] args){

        Pilhas minhaPilha = new Pilhas();

        minhaPilha.push(new NoPilhas(1));
        minhaPilha.push(new NoPilhas(2));
        minhaPilha.push(new NoPilhas(3));
        minhaPilha.push(new NoPilhas(4));
        minhaPilha.push(new NoPilhas(5));
        minhaPilha.push(new NoPilhas(6));

        System.out.println(minhaPilha);

        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);

        minhaPilha.push(new NoPilhas(9999));

        System.out.println(minhaPilha);
    }
}
