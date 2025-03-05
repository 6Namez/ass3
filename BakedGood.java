/*-------------------------------------------------------------------------*
 *---									---*
 *---		BakedGood.java						---*
 *---									---*
 *---	    This file defines a class that keeps track of the		---*
 *---	ingredients of and processing of a baked good.			---*
 *---									---*
 *---	----	----	----	----	----	----	----	----	---*
 *---									---*
 *---	Version 1a		2025 February 19	Joseph Phillips	---*
 *---									---*
 *-------------------------------------------------------------------------*/

 import		java.util.*;

 class		BakedGood
 {
   //  I.  Constructor(s) and factory(s):
   //  PURPOSE:  To initialize 'this' to be an empty, default, baked good.
   //	No parameters.  No return value.
   public
   BakedGood			()
   { }
 
   //  II.  Accessors:
   //  PURPOSE:  To return which ingredients have been included in 'this'
   //	BakedGood.
   public
   HashSet<Ingredient>
         getIngredientDs	()
   {
     return(ingredientDs_);
   }
 
   //  PURPOSE:  To return the baking time number.  No parameters.
   public
   double	getBakingTimeNumber
                 ()
   {
     return(bakingTimeNumber_);
   }
 
   //  PURPOSE:  To return the baking time units.  No parameters.
   public
   Time		getBakingTimeUnits
                 ()
   {
     return(bakingTimeUnits_);
   }
 
   //  PURPOSE:  To return the baking temperature number.  No parameters.
   public
   double	getBakingTemperatureNumber
                 ()
   {
     return(bakingTemperatureNumber_);
   }
 
   //  PURPOSE:  To return the baking temperature units.  No parameters.
   public
   Temperature	getBakingTemperatureUnits
                 ()
   {
     return(bakingTemperatureUnits_);
   }
 
 
   //  III.  Mutators:
   //  PURPOSE:  To note that 'this' BakedGood also has ingredient
   //	'newIngredient'.  No return value.
   public
   void		addIngredient	(Ingredient	newIngredient
                 )
   {
     ingredientDs_.add(newIngredient);
   }
 
 
   //  PURPOSE:  To note that 'this' BakedGood was baked for 'newTimeNumber'
   //	'newTimeUnits'.  No return value.
   public
   void		chooseTime	(double		newTimeNumber,
                    Time		newTimeUnits
                 )
   {
     bakingTimeNumber_	= newTimeNumber;
     bakingTimeUnits_	= newTimeUnits;
   }
 
 
   //  PURPOSE:  To note that 'this' BakedGood was baked for
   //	'newTemperatureNumber' 'newTemperatureUnits'.  No return value.
   public
   void		chooseTemperature
                 (double		newTemperatureNumber,
                    Temperature	newTemperatureUnits
                 )
   {
     bakingTemperatureNumber_	= newTemperatureNumber;
     bakingTemperatureUnits_	= newTemperatureUnits;
   }
 
 
   //  IV.  Methods that do main and misc. work of class:
   //  PURPOSE:  To return a string representation of 'this'.  No parameters.
   public
   String	toString	()
   {
     StringBuilder	stringMe	= new StringBuilder();
     int			numIngredients	= getIngredientDs().size();
     int			index;
 
     stringMe.append("baked good of");
 
     if  (numIngredients > 0)
     {
       Iterator<Ingredient>	iter	= getIngredientDs().iterator();
 
       index			= 0;
 
       do
       {
     if  (index == 0)
     {
       stringMe.append(" ");
     }
     else
     if  ( (numIngredients >= 2) && (index == (numIngredients-1)) )
     {
       stringMe.append(" and ");
     }
     else
     {
       stringMe.append(", ");
     }
 
     stringMe.append(INGREDIENT_NAMES[iter.next().ordinal()]);
     index++;
       }
       while  (iter.hasNext());
 
     }
 
     if  (getBakingTimeUnits() != Time.NO_TIME)
     {
       stringMe.append(" baked for ");
       stringMe.append(getBakingTimeNumber());
       stringMe.append(" ");
       stringMe.append(TIME_NAMES[getBakingTimeUnits().ordinal()]);
       stringMe.append(" at ");
       stringMe.append(getBakingTemperatureNumber());
       stringMe.append(" ");
       stringMe.append(TEMPERATURE_NAMES[getBakingTemperatureUnits().ordinal()]);
     }
 
     stringMe.append(".");
 
     return(stringMe.toString());
   }
 
 
   //  PURPOSE:  To add the results of 'other' into 'this'.  No return value.
   public
   void		combineWith	(BakedGood	other)
   {
     for  (Ingredient ingredient : other.getIngredientDs())
     {
       ingredientDs_.add(ingredient);
     }
 
     if  ( (getBakingTimeUnits()		== Time.NO_TIME)  &&
       (other.getBakingTimeUnits()	!= Time.NO_TIME)
     )
     {
       bakingTimeUnits_		= other.getBakingTimeUnits();
       bakingTimeNumber_		= other.getBakingTimeNumber();
       bakingTemperatureUnits_	= other.getBakingTemperatureUnits();
       bakingTemperatureNumber_	= other.getBakingTemperatureNumber();
     }
   }
 
   //  V.  Member vars:
   //  PURPOSE:  To tell which ingredients have been included in 'this'
   //	BakedGood.
   private
   HashSet<Ingredient>
         ingredientDs_			= new HashSet<Ingredient>();
 
   //  PURPOSE:  To hold the baking time number.
   private
   double	bakingTimeNumber_		= -1.0;
 
   //  PURPOSE:  To hold the baking time units.
   private
   Time		bakingTimeUnits_		= Time.NO_TIME;
 
   //  PURPOSE:  To hold the baking temperature number.
   private
   double	bakingTemperatureNumber_	= -1.0;
 
   //  PURPOSE:  To hold the baking temperature units.
   private
   Temperature	bakingTemperatureUnits_		= Temperature.NO_TEMPERATURE;
 
   //  PURPOSE:  To hold the names of the types of ingredients.
   public
   static
   final
   String	INGREDIENT_NAMES[]
                   = { "flour",
                     "eggs",
                     "sugar",
                     "honey",
                     "cocoa",
                     "vanilla",
                     "cinnamon",
                     "butter",
                     "vegetable oil",
                     "milk",
                     "water",
                     "baking soda",
                     "baking powder"
                   };
 
   //  PURPOSE:  To hold the names of the time units.
   public
   static
   final
   String	TIME_NAMES[]	= { "",
                     "minutes",
                     "hours"
                   };
 
   //  PURPOSE:  To hold the names of the temperature units.
   public
   static
   final
   String	TEMPERATURE_NAMES[]
                 = { "",
                    "Celsius",
                     "Fahrenheit"
                   };
 
 }