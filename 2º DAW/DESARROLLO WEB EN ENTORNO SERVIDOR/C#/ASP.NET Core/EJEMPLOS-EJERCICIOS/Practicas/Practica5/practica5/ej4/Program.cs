using ej4.Repository;
using ej4.Data;
using ej4.Interfaces;
using Microsoft.EntityFrameworkCore;
using ej4.Repositories;

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
builder.Services.AddTransient<IRepositoryUsuarios, RepositoryUsuarios>();

//sesion
builder.Services.AddDistributedMemoryCache(); // Necesario para sesiones  
builder.Services.AddSession(options => {
    options.IdleTimeout = TimeSpan.FromMinutes(30); // Expira tras 30 min de inactividad  
});


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

app.UseSession(); //sesion

app.MapControllerRoute(
    name: "default",
    pattern: "{controller=Home}/{action=Index}/{id?}");

app.Run();
