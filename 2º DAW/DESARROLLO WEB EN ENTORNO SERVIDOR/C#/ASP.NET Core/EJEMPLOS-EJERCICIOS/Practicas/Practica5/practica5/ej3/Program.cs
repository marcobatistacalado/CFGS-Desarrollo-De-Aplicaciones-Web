using Microsoft.EntityFrameworkCore;
using ej3.Data;
using ej3.Repository;
using ej3.Interfaces;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddControllersWithViews();
builder.Services.AddDbContext<VideoclubContext>(
    options => {
        options.UseSqlServer("name = SqlVideoclub");

    });
builder.Services.AddTransient<IRepositoryPeliculas, RepositoryPeliculas>();
builder.Services.AddTransient<IRepositoryGeneros, RepositoryGeneros>();
builder.Services.AddTransient<IRepositoryInfoPeliculas, RepositoryInfoPeliculas>();

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment())
{
    app.UseExceptionHandler("/Home/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();
app.UseStaticFiles();

app.UseRouting();

app.UseAuthorization();

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();
