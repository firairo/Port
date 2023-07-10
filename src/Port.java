import port.AddShip;
import port.GetAllShipsName;
import port.GetMassAllShips;
import port.RemoveShip;
import ships.Ship;

import java.util.ArrayList;

public class Port implements AddShip, RemoveShip, GetAllShipsName, GetMassAllShips {

    private ArrayList<Ship> ships = new ArrayList<>();

    @Override
    public void addShip(Ship ship) {
        if (ships != null && ships.size() < 10) {
            ships.add(ship);
        }
    }

    @Override
    public void removeShip() {
        if (ships != null) {
            ships.remove(ships.size() - 1);
        }
    }

    @Override
    public void getAllShipsName() {
        ships.forEach(ship -> System.out.println(ship.name));
    }

    @Override
    public Integer getMassAllShips() {
        Integer allMass = 0;
        for (int i = 0; i < ships.size() - 1; i++){
            allMass = allMass + ships.get(i).deck.getVolumeDeck();
        }
        return allMass;
    }
}