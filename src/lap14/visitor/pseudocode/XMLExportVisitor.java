package lap14.visitor.pseudocode;

public class XMLExportVisitor implements Visitor {
	@Override
	public String visitDot(Dot d) {
		return String.format("""
                <dot>
                    <x>%d</x>
                    <y>%d</y>
                </dot>""", d.x, d.y);
	}

	@Override
	public String visitCircle(Circle c) {
		return String.format("""
                <circle>
                    <x>%d</x>
                    <y>%d</y>
                    <radius>%d</radius>
                </circle>""", c.x, c.y, c.radius);
	}

	@Override
	public String visitRectangle(Rectangle r) {
		return String.format("""
                <rectangle>
                    <x1>%d</x1>
                    <y1>%d</y1>
                    <height>%d</height>
                    <width>%d</width>
                </rectangle>""", r.x, r.y, r.height, r.width);
	}

	@Override
	public String visitCompoundGraphic(CompoundShape cs) {
		StringBuilder sb = new StringBuilder();
		sb.append("<compound>\n");
		for (Shape shape : cs.shapes) {
			String s = shape.accept(this);
			sb.append("    ").append(s.replace("\n", "\n    ")).append("\n");
		}
		sb.append("</compound>\n");
		return sb.toString();
	}

	public String export(Shape... args) {
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?>" + "\n");
		for (Shape shape : args) {
			sb.append(shape.accept(this)).append("\n");
		}
		return sb.toString();
	}
}

