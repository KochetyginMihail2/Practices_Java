package bikeproject;

public interface MountainParts {
    // Константа
    String TERRAIN = "off_road";
    
    // Методы, которые должны реализовать классы
    String getSuspension();
    void setSuspension(String newValue);
    String getType();
    void setType(String newValue);
}