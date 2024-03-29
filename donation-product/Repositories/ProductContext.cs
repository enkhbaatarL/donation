using Microsoft.EntityFrameworkCore;
using donation_product.Models;


namespace donation_product.Repositories
{
    public class ProductContext : DbContext
    {
        public DbSet<Product> Products { get; set; }
        public ProductContext(DbContextOptions<ProductContext> options) : base(options)
        {
        }
        protected override void OnModelCreating(ModelBuilder builder)
        {
            builder.Entity<Product>()
                .HasKey(p => p.ProdId)
                .HasName("PrimaryKey_ProdId");
            builder.Entity<Product>()
                .Property(p => p.ProdState)
                .HasConversion<string>();
            builder.Entity<Product>()
                .Property(p => p.BizType)
                .HasConversion<string>();
        }
    }
}