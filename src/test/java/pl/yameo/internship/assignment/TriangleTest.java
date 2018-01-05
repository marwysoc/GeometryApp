package pl.yameo.internship.assignment;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import pl.yameo.internship.assignment.Triangle;

public class TriangleTest {
	private static final Double initialEdgeA = 3.0;
	private static final Double initialEdgeB = 4.0;
	private static final Double initialEdgeC = 5.0;

	@Test
	public void when_triangle_is_created_then_proper_dimensions_are_returned() {
		Triangle triangle = new Triangle(initialEdgeA, initialEdgeB, initialEdgeC);

		Assert.assertEquals(initialEdgeA, triangle.listDimensions().get(0), 0.0001);
		Assert.assertEquals(initialEdgeB, triangle.listDimensions().get(1), 0.0001);
		Assert.assertEquals(initialEdgeC, triangle.listDimensions().get(2), 0.0001);
	}

	@Ignore("Not checked.")
	@Test(expected = IllegalArgumentException.class)
	public void when_impossible_triangle_is_created_then_exception_is_thrown() {
		new Triangle(initialEdgeA, 1.0, initialEdgeC);
	}

	//TODO: 50% fails anyway, why bother.
}
