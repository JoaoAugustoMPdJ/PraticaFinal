package util;

import java.io.*;
import javax.xml.bind.*;
import model.*;
import java.util.List;

public class XMLDataHandler {

    // Método para salvar lista de veículos em um arquivo XML
    public static void salvarVeiculos(List<Veiculo> veiculos, String nomeArquivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(Veiculos.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Veiculos listaVeiculos = new Veiculos();
            listaVeiculos.setVeiculos(veiculos);

            marshaller.marshal(listaVeiculos, new File(nomeArquivo));
        } catch (JAXBException e) {
            e.printStackTrace();
            // Tratamento de erro: informar usuário sobre o erro de salvamento
        }
    }

    // Método para carregar lista de veículos a partir de um arquivo XML
    public static List<Veiculo> carregarVeiculos(String nomeArquivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(Veiculos.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Veiculos listaVeiculos = (Veiculos) unmarshaller.unmarshal(new File(nomeArquivo));
            return listaVeiculos.getVeiculos();
        } catch (JAXBException e) {
            e.printStackTrace();
            // Tratamento de erro: informar usuário sobre o erro de carregamento
            return null;
        }
    }

    // Método para salvar lista de motoristas em um arquivo XML
    public static void salvarMotoristas(List<Motorista> motoristas, String nomeArquivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(Motoristas.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Motoristas listaMotoristas = new Motoristas();
            listaMotoristas.setMotoristas(motoristas);

            marshaller.marshal(listaMotoristas, new File(nomeArquivo));
        } catch (JAXBException e) {
            e.printStackTrace();
            // Tratamento de erro: informar usuário sobre o erro de salvamento
        }
    }

    // Método para carregar lista de motoristas a partir de um arquivo XML
    public static List<Motorista> carregarMotoristas(String nomeArquivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(Motoristas.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Motoristas listaMotoristas = (Motoristas) unmarshaller.unmarshal(new File(nomeArquivo));
            return listaMotoristas.getMotoristas();
        } catch (JAXBException e) {
            e.printStackTrace();
            // Tratamento de erro: informar usuário sobre o erro de carregamento
            return null;
        }
    }

    // Método para salvar lista de incidentes em um arquivo XML
    public static void salvarIncidentes(List<Incidente> incidentes, String nomeArquivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(Incidentes.class);
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Incidentes listaIncidentes = new Incidentes();
            listaIncidentes.setIncidentes(incidentes);

            marshaller.marshal(listaIncidentes, new File(nomeArquivo));
        } catch (JAXBException e) {
            e.printStackTrace();
            // Tratamento de erro: informar usuário sobre o erro de salvamento
        }
    }

    // Método para carregar lista de incidentes a partir de um arquivo XML
    public static List<Incidente> carregarIncidentes(String nomeArquivo) {
        try {
            JAXBContext context = JAXBContext.newInstance(Incidentes.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();

            Incidentes listaIncidentes = (Incidentes) unmarshaller.unmarshal(new File(nomeArquivo));
            return listaIncidentes.getIncidentes();
        } catch (JAXBException e) {
            e.printStackTrace();
            // Tratamento de erro: informar usuário sobre o erro de carregamento
            return null;
        }
    }
}

