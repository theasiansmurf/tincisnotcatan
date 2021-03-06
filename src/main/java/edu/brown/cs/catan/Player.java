package edu.brown.cs.catan;

import java.util.Map;

/**
 * Represents a Catan Player. Responsible for keeping track of a Player's data
 * including their Hand, Name, Points..etc.
 *
 */
public interface Player {

  /**
   * Returns the number of roads a player has remaining.
   *
   * @return Number of roads remaining.
   */
  int numRoads();

  /**
   * Returns the number of settlements a player has remaining.
   *
   * @return Number of settlements remaining.
   */
  int numSettlements();

  /**
   * Returns the number of cities a player has remaining.
   *
   * @return Number of cities remaining.
   */
  int numCities();

  /**
   * Removes the resource costs of building a road.
   */
  void buildRoad();

  /**
   * Removes the resource costs of building a settlement.
   */
  void buildSettlement();

  /**
   * Removes the resource costs of building a city.
   */
  void buildCity();

  /**
   * Removes the resource costs of buying a development card.
   */
  void buyDevelopmentCard();

  /**
   * Uses a Road piece.
   */
  void useRoad();

  /**
   * Uses a City piece.
   */
  void useCity();

  void useSettlement();

  void playDevelopmentCard(DevelopmentCard card);

  Map<Resource, Double> getResources();

  Map<DevelopmentCard, Integer> getDevCards();

  void addResource(Resource resource);

  void addResource(Resource resource, double count);

  void addResource(Resource resource, double count, Bank bank);

  void removeResource(Resource resource);

  void removeResource(Resource resource, double count);

  void removeResource(Resource resource, double count, Bank bank);

  double getNumResourceCards();

  int getNumDevelopmentCards();

  void addDevelopmentCard(DevelopmentCard card);

  Player getImmutableCopy();

  String getName();

  int getID();

  int numPlayedKnights();

  int numVictoryPoints();

  String getColor();

  boolean canBuyDevelopmentCard();

  boolean canBuildRoad();

  boolean canBuildCity();

  boolean canBuildSettlement();

  boolean hasResource(Resource res, double count);

}
