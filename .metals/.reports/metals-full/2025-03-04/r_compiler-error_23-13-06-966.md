file://<WORKSPACE>/Ingredient.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:


action parameters:
offset: 492
uri: file://<WORKSPACE>/Ingredient.java
text:
```scala
/*-------------------------------------------------------------------------*
 *---									---*
 *---		Ingredient.java						---*
 *---									---*
 *---	    This file defines an enumeration of types of ingredients.	---*
 *---									---*
 *---	----	----	----	----	----	----	----	----	---*
 *---									---*
 *---	Version 1a		2025 February 19	Joseph Phillips	---*
 *---									---*
 *-------------------------------------------------------------------------*/

 enum	Ingredient
 {
   FLOUR@@,
   EGG,
   SUGAR,
   HONEY,
   COCOA,
   VANILLA,
   CINNAMON,
   BUTTER,
   VEGETABLE_OIL,
   MILK,
   WATER,
   BAKING_SODA,
   BAKING_POWDER
 }
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:935)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:164)
	dotty.tools.pc.MetalsDriver.run(MetalsDriver.scala:45)
	dotty.tools.pc.HoverProvider$.hover(HoverProvider.scala:40)
	dotty.tools.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:376)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator