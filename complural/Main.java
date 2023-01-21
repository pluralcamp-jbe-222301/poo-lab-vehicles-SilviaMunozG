package complural;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car coche = new Car();
		coche.radio();
		
		Bus autobus = new Bus();
		autobus.parada();
		
		Moto motocicleta = new Moto();
		motocicleta.adelanta();
		
		Train tren = new Train();
		tren.descarrila();
		
		Vehicles[] vehiculos = new Vehicles[] {coche,autobus,motocicleta,tren};
		
		for(Vehicles v : vehiculos) {
			if(v instanceof Bus)
				v.apaga();
			else if(v instanceof Train)
				v.arrenca();
			else 
				v.mou();
		}
		
		Polluter[] contaminantes = new Polluter[] {coche,autobus,motocicleta};
		
		for(Polluter contaminante : contaminantes) {
			contaminante.expulsaCO2();
			contaminante.carburant();
		}

	}

}