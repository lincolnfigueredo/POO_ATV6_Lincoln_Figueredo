public class App {
    public static void main(String[] args) throws Exception {
        Carta carta01 = new Carta (1111001, "Rua Lagoa do Ouro, 132, COHAB, Recife-PE", "Rua José Ribamar Soares Aguiar, 99, Parque Iracema, Fortaleza-CE", "CARTA REGISTRADA");
        Carta carta02 = new Carta (1111002, "Rua Vinte e Oito, S/N, Pedra Linda, Petrolina-PE", "Rua Irmã Elvira Paris, 2215, Dom Aquino, Cuiabá-MT", "CARTA SIMPLES");
        Carta carta03 = new Carta (1111003, "Rua Atenas, 289, Dom Avelar, Petrolina-PE", "Avenida Parigot de Souza, 3421, Vila Industrial, Toledo-PR", "CARTA REGISTRADA");
        gerarCodigoRastreamento(carta01);
        gerarCodigoRastreamento(carta02);
        gerarCodigoRastreamento(carta03);

        Conta conta01 = new Conta (2222001, "Av. João de Barros, 111, Boa Vista, Recife-PE", "Rua Antônio Gomes de Freitas, 29, Ilha do Leite, Recife-PE", "CELPE - ENERGIA", 2021, 6);
        Conta conta02 = new Conta (2222002, "Av. Luís Carlos Berrini, 1.376 - 26º andar, São Paulo-SP", "Rua Prefeito Severino José de Lima, 50, Artur Lundgren II, Paulista-PE", "VIVO - TELEFONE", 2021, 5);
        Conta conta03 = new Conta (2222003, "Rua da Aurora, 777, Boa Vista, Recife-PE", "Rua José Ramalho, 925, Guadalupe, Olinda-PE", "COMPESA - ÁGUA", 2021, 4);
        gerarCodigoRastreamento(conta01);
        gerarCodigoRastreamento(conta02);
        gerarCodigoRastreamento(conta03);

        Pacote pacote01 = new Pacote (3333001, "Rua Coronel Silvestre Bastos, 131, Dois Irmãos, Recife-PE", "Rua Irancuba, S/N, Lagoinha, Porto Velho-RO", 1.0, 1.0, 1.0);
        Pacote pacote02 = new Pacote (3333002, "6ª Travessa Maragogipe, 199, Tejipió, Recife-PE", "1ª Travessa Jairo Marques Luz, 653, Tabuleiro do Martins, Maceió-AL", 2.0, 2.0, 2.0);
        Pacote pacote03 = new Pacote (3333003, "Estrada de Belém, 87, Encruzilhada, Recife-PE", "Rua dos Arcos, 1250, Jardim Seminário, Campo Grande-MS", 1.0, 2.0, 3.0);
        gerarCodigoRastreamento(pacote01);
        gerarCodigoRastreamento(pacote02);
        gerarCodigoRastreamento(pacote03);
    }

    public static void gerarCodigoRastreamento(Enderecavel e) {
        System.out.println("\n----------------------------------------------------------------------------------------------------\n" +
                           "[Código de Rastreio: " + e.getCodigoRastreio() + "]\n► Endereço Remetente: " + e.getEnderecoRemetente() + "\n► Endereço Destinatário: " + e.getEnderecoDestinatario() +
                           "\n----------------------------------------------------------------------------------------------------");
    }
}
