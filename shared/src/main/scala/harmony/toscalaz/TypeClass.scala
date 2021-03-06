package harmony.toscalaz

import harmony.toscalaz.typeclass._

trait TypeClass
  extends ApplicativeConverter
    with ApplicativePlusConverter
    with ApplyConverter
    with BifoldableConverter
    with BifunctorConverter
    with BindConverter
    with BindRecConverter
    with CategoryConverter
    with CoBindConverter
    with ComonadConverter
    with ComposeConverter
    with ContravariantConverter
    with EqConverter
    with FoldableConverter
    with FunctionKConverter
    with FunctorConverter
    with InvariantFunctorConverter
    with MonadConverter
    with MonadErrorConverter
    with MonadReaderConverter
    with MonadStateConverter
    with MonoidConverter
    with OrderConverter
    with SemigroupConverter
    with ShowConverter
    with TraverseConverter

object TypeClass
  extends TypeClass
