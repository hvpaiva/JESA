package Jesa.testing;

/// <summary>
/// The act of building an exception-centric aggregate command test specification.
/// </summary>
public interface ExceptionCentricAggregateCommandTestSpecificationBuilder
{
    /// <summary>
    /// Builds the test specification thus far.
    /// </summary>
    /// <returns>The test specification.</returns>
    ExceptionCentricAggregateCommandTestSpecification build();
}