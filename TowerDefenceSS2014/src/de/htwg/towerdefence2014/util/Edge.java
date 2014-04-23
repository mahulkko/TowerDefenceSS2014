package de.htwg.towerdefence2014.util;

/**
* <b>Class Edge</b>
* @author Christoph Knetschke and Martin Hulkkonen
*/
public class Edge<V> {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/

	/** Start node */
	final private V source; 
	 
	/** Finish node */
	final private V target;
	 
	/** Weight of the edge */
	final private double weight;
	

    /************************************************************
	 * Public constructor
	 ***********************************************************/
		
	/**
	 * Constructor of the edge without wight
	 * @param source - Start node
	 * @param target - Finish node
	 */
	public Edge(V source, V target) {
		this.source = source;
		this.target = target;
		this.weight = 1.0;
	}
	
	/**
	 * Constructor of the edge with weight
	 * @param source - Start node
	 * @param target - Finish node
	 * @param weight - Weight of the edge
	 */
	public Edge(V source, V target, double weight) {
	    this.source = source;
	    this.target = target;
	    this.weight = weight;
	}
	
	/************************************************************
	 * Public methods
	 ***********************************************************/

	/**
	 * <b>Get the source from the edge</b>
	 * @return Returns the source of the edge
	 */
	public V getSource() {
	    return this.source;
	}
	
	/**
	 * <b>Get the target from the edge</b>
	 * @return Returns the target of the edge
	 */
	public V getTarget() {
	    return this.target;
	}
	
	/**
	 * <b>Get the weight of the edge</b>
	 * @return Returns the weight of the edge
	 */
	public double getWeight() {
	    return this.weight;
	}
}

