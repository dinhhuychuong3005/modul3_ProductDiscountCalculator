import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discountPercent = Float.parseFloat(request.getParameter("discount_percent"));
        float discountAmount = (float) (price * discountPercent * 0.01);
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h1>Product Discount Calculator</h1>");
        printWriter.println("<label>Product Description: </label><span>" + description + "</span></br>");
        printWriter.println("<label>Price: $</label><span>" + price + "</span></br>");
        printWriter.println("<label>Discount Percent: </label><span>" + discountPercent + " %</span></br>");
        printWriter.println("<label>Discount Amount: $</label><span>" + discountAmount + "</span></br>");
        printWriter.println("<label>Discount Price: $</label><span>" + (price-discountAmount) + "</span></br>");
    }
}
