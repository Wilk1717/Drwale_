package com.forest.simulation.core;

import com.forest.simulation.agents.Agents;
import java.util.List;

public class Simulation {
    private int forestDensity;
    private int regrowthTime;
    private int fineAmount;
    private int initialCapital;
    private int livingCostParameter;
    private int cooldownParameter;
    private int lumberjackVisionParameter;
    private int rangerPatrolParameter;

    private Board board;
    private List<Agents> agents;

    public void setup() {
        // Tu będzie logika inicjalizacji agentów i planszy
    }

    public void step() {
        // Tu będzie główna pętla wykonująca ruchy wszystkich agentów
    }
}