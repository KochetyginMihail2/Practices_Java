package bikeproject;

public interface RoadParts {
    // Константа
    String TERRAIN = "track_racing";
    
    // Методы, которые должны реализовать классы
    int getTyreWidth();
    void setTyreWidth(int newValue);
    int getPostHeight();
    void setPostHeight(int newValue);
}