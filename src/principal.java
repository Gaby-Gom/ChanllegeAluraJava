import javax.swing.JOptionPane;

public class principal {
	static void convertirMoneda (double valorMoneda, String monedaOrigen, String monedaDestino, String bandera) {
		String salida = "";
		String cantidadCambio = "";
		
		if (bandera == "PO") {
			cantidadCambio = JOptionPane.showInputDialog("Ingrese la cantidad de " + monedaOrigen);
		} else {
			cantidadCambio = JOptionPane.showInputDialog("Ingrese la cantidad de " + monedaDestino);
		}
		
		double cambio = Double.parseDouble(cantidadCambio) / valorMoneda;
		cambio = (double)Math.round(cambio * 100d) / 100;
		
		if (bandera == "PO") {
			salida = "La cantidad de " + cantidadCambio + " " + monedaOrigen + " representan " + cambio + " " + monedaDestino;
		} else {
			salida = "La cantidad de " + cantidadCambio + " " + monedaDestino + " representan " + cambio + " " + monedaOrigen;
		}
		
		Object [] botones1 = { "MENU PRINCIPAL", "SALIR" };
        int eleccionFinal = JOptionPane.showOptionDialog (null, salida, "RESULTADOS DEL CAMBIO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones1, botones1[0]);
		if (eleccionFinal == 0) {
			inicio();
		} else {
			JOptionPane.showMessageDialog(null, "El programa ha terminado");
			System.exit(0);
		}
	}

	static void convertirMedidas (double valorMedida, String medidaOrigen, String medidaDestino, String bandera) {
		String salida = "";
		String medidaCambio = "";
		
		if (bandera == "MO") {
			medidaCambio = JOptionPane.showInputDialog("Ingrese la cantidad de " + medidaOrigen);
		} else {
			medidaCambio = JOptionPane.showInputDialog("Ingrese la cantidad de " + medidaDestino);
		}
		
		double cambio = Double.parseDouble(medidaCambio) / valorMedida;
		cambio = (double)Math.round(cambio * 100d) / 100;
		
		if (bandera == "MO") {
			salida = "La cantidad de " + medidaCambio + " " + medidaOrigen + " representan " + cambio + " " + medidaDestino;
		} else if (bandera == "OM") {
			salida = "La cantidad de " + medidaCambio + " " + medidaDestino + " representan " + cambio + " " + medidaOrigen;
		}

		Object [] botones1 = { "MENU PRINCIPAL", "SALIR" };
        int eleccionFinal = JOptionPane.showOptionDialog (null, salida, "RESULTADOS DEL CAMBIO", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones1, botones1[0]);
		if (eleccionFinal == 0) {
			inicio();
		} else {
			JOptionPane.showMessageDialog(null, "El programa ha terminado");
			System.exit(0);
		}
	}
	
	static void monedas() {
		Object [] tipoConversionMoneda ={"De Pesos Argentinos a Otra Moneda","De Otra Moneda a Pesos Argentinos"}; 
    	Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opci�n", "Elegir",JOptionPane.QUESTION_MESSAGE,null,tipoConversionMoneda, tipoConversionMoneda[0]);
    	
    	if (opcion == "De Pesos Argentinos a Otra Moneda") {
    		// Convertimos de Pesos argentinos a otras monedas
    		
    		Object [] monedasPosibles ={"D�lares","Euros", "Libras Esterlinas", "Reales brasile�os", "Yenes japoneses", "Wuones surcoreanos"}; 
    		Object opcionMoneda = JOptionPane.showInputDialog(null,"Convertir de Pesos Argentinos a:", "Elegir moneda destino",JOptionPane.QUESTION_MESSAGE,null,monedasPosibles, monedasPosibles[0]);
     
    		switch(opcionMoneda.toString()) {
        		case "D�lares": 
        			convertirMoneda(118.89, "Pesos Argentinos", opcionMoneda.toString(), "PO");
					break;
					
        		case "Euros": 
        			convertirMoneda(126.80, "Pesos Argentinos", opcionMoneda.toString(), "PO");
					break;
					
        		case "Libras Esterlinas": 
        			convertirMoneda(149.21, "Pesos Argentinos", opcionMoneda.toString(), "PO");
					break;
					
        		case "Reales brasile�os": 
        			convertirMoneda(25.24, "Pesos Argentinos", opcionMoneda.toString(), "PO");
					break;
					
        		case "Yenes japoneses": 
        			convertirMoneda(0.93, "Pesos Argentinos", opcionMoneda.toString(), "PO");
					break;
					
        		case "Wuones surcoreanos": 
        			convertirMoneda(0.094, "Pesos Argentinos", opcionMoneda.toString(), "PO");
					break;
    		}
    		
    	}
    	
    	if (opcion == "De Otra Moneda a Pesos Argentinos") {
    		
    		Object [] monedasPosibles ={"D�lares","Euros", "Libras Esterlinas", "Reales brasile�os", "Yenes japoneses", "Wuones surcoreanos"}; 
    		Object opcionMoneda = JOptionPane.showInputDialog(null,"Convertir a Pesos Argentinos desde:", "Elegir moneda origen",JOptionPane.QUESTION_MESSAGE,null,monedasPosibles, monedasPosibles[0]);
    		
    		
    		switch(opcionMoneda.toString()) {
        		case "D�lares": 
        			convertirMoneda(0.00833 , "Pesos Argentinos", opcionMoneda.toString(), "OP");
					break;
					
        		case "Euros": 
        			convertirMoneda(0.00773, "Pesos Argentinos", opcionMoneda.toString(), "OP");
					break;
					
        		case "Libras Esterlinas": 
        			convertirMoneda(0.0066, "Pesos Argentinos", opcionMoneda.toString(), "OP");
					break;
					
        		case "Reales brasile�os": 
        			convertirMoneda(0.040, "Pesos Argentinos", opcionMoneda.toString(), "OP");
					break;
					
        		case "Yenes japoneses": 
        			convertirMoneda(1.06, "Pesos Argentinos", opcionMoneda.toString(), "OP");
					break;
					
        		case "Wuones surcoreanos": 
        			convertirMoneda(10.30, "Pesos Argentinos", opcionMoneda.toString(), "OP");
					break;
    		}
    	}
	}
	
	static void medidas() {
		Object [] tipoConversionMedida ={"De Sistema M�trico a Sistema Anglosaj�n","De Sistema Anglosaj�n a Sistema M�trico"}; 
    	Object opcion = JOptionPane.showInputDialog(null,"Selecciona una opci�n", "Elegir",JOptionPane.QUESTION_MESSAGE,null,tipoConversionMedida, tipoConversionMedida[0]);
    	
    	if (opcion == "De Sistema M�trico a Sistema Anglosaj�n") {
    		
    		Object [] medidasPosibles ={"Pulgadas","Pies", "Yardas", "Millas", "Leguas"}; 
    		Object opcionMedida = JOptionPane.showInputDialog(null,"Convertir de metros:", "Elegir medida destino",JOptionPane.QUESTION_MESSAGE,null,medidasPosibles, medidasPosibles[0]);
    		
    		switch(opcionMedida.toString()) {
	    		case "Pulgadas": 
	    			convertirMedidas(0.0254, "Metros", opcionMedida.toString(), "MO");
					break;
					
	    		case "Pies": 
	    			convertirMedidas(0.3048, "Metros", opcionMedida.toString(), "MO");
					break;
					
	    		case "Yardas": 
	    			convertirMedidas(0.9144, "Metros", opcionMedida.toString(), "MO");
					break;
					
	    		case "Millas": 
	    			convertirMedidas(1609.34, "Metros", opcionMedida.toString(), "MO");
					break;
					
	    		case "Leguas": 
	    			convertirMedidas(4828.03, "Metros", opcionMedida.toString(), "MO");
					break;
			}
    	}
    	
    	if (opcion == "De Sistema Anglosaj�n a Sistema M�trico") {
    		Object [] medidasPosibles ={"Pulgadas","Pies", "Yardas", "Millas", "Leguas"}; 
    		Object opcionMedida = JOptionPane.showInputDialog(null,"Convertir a metros:", "Elegir medida origen",JOptionPane.QUESTION_MESSAGE,null,medidasPosibles, medidasPosibles[0]);
    	
    		switch(opcionMedida.toString()) {
	    		case "Pulgadas": 
	    			convertirMedidas(39.3701, "Metros", opcionMedida.toString(), "OM");
					break;
					
	    		case "Pies": 
	    			convertirMedidas(3.28084, "Metros", opcionMedida.toString(), "OM");
					break;
					
	    		case "Yardas": 
	    			convertirMedidas(1.09361, "Metros", opcionMedida.toString(), "OM");
					break;
					
	    		case "Millas": 
	    			convertirMedidas(0.000621371, "Metros", opcionMedida.toString(), "OM");
					break;
					
	    		case "Leguas": 
	    			convertirMedidas(0.000207124, "Metros", opcionMedida.toString(), "OM");
					break;
			}
    	
    	}
	}
	
	
	static void inicio() {
		JOptionPane panel = new JOptionPane();
        Object [] botones1 = { "MONEDAS", "MEDIDAS" };
        
      int eleccion = JOptionPane.showOptionDialog (null, "Qu� opci�n deseas elegir ?", "CONVERSIONES", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null/*icono*/, botones1, botones1[0]);
      
        if (eleccion == 0) {
        	monedas();
        }
        
        if (eleccion == 1) {
        	medidas();
        	// JOptionPane.showMessageDialog(null, "ELIGIO CONVERTIR MEDIDAS");
        }
	}


	public static void main(String[] args) {
   
        inicio();

	}
}
