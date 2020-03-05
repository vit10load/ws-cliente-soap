/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.main;

/**
 *
 * @author vitcl
 */
public class Main {
    
    public static void main(String[] args) {
        /*WS.CalculadoraWSService service = new WS.CalculadoraWSService();
        WS.CalculadoraWS port = service.getCalculadoraWSPort();
        double resultado = port.getSoma(10, 10);
        
        System.out.println(resultado);*/
        
    }

    private static double getSoma(int n1, int n2) {
        WS.CalculadoraWSService service = new WS.CalculadoraWSService();
        WS.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getSoma(n1, n2);
    }

    private static double getMul(int n1, int n2) {
        WS.CalculadoraWSService service = new WS.CalculadoraWSService();
        WS.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getMul(n1, n2);
    }

    private static double getDiv(int n1, int n2) {
        WS.CalculadoraWSService service = new WS.CalculadoraWSService();
        WS.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getDiv(n1, n2);
    }

    private static double getSub(int n1, int n2) {
        WS.CalculadoraWSService service = new WS.CalculadoraWSService();
        WS.CalculadoraWS port = service.getCalculadoraWSPort();
        return port.getSub(n1, n2);
    }
}
