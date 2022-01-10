-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 09-Jan-2022 às 12:44
-- Versão do servidor: 10.4.19-MariaDB
-- versão do PHP: 7.4.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `alfajava`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE `curso` (
  `codigo` int(11) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `descricao` text NOT NULL,
  `valor` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`codigo`, `nome`, `descricao`, `valor`) VALUES
(1, 'Introdução a Programação', 'Nulla eget dui massa. Nullam sed iaculis dui, non mattis enim. Maecenas ac diam consequat, aliquam justo sed, vestibulum quam. Duis neque nisl, viverra eget placerat sed, consequat pellentesque sem. Nulla facilisi. In congue aliquet iaculis. Fusce consequat libero et felis suscipit lobortis. Vivamus aliquam enim tellus, at posuere dolor commodo ac. Nam tortor nisi, bibendum sit amet risus placerat, gravida congue urna. Curabitur iaculis id elit id mollis. Proin feugiat tortor sollicitudin, scelerisque ex et, molestie purus. Pellentesque condimentum lacinia lorem, in faucibus quam ornare sit amet. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.', 123.58),
(2, 'Contabilidade 25', 'Teste bla bla bla blandit congue felis, a mattis elit sagittis eget. Nunc efficitur eleifend libero, ac blandit tellus vulputate ultricies. Curabitur eu nisl non tortor suscipit scelerisque ac a velit. Cras eleifend at nulla ultricies sodales. Praesent nec scelerisque ligula, nec ultricies est. Sed tincidunt augue et enim semper, vitae egestas nunc consectetur. Fusce vestibulum luctus risus, vitae sagittis ante commodo nec. Vivamus commodo, risus rutrum tempus placerat, turpis dui rutrum urna, et suscipit nisi urna eu ex. Pellentesque mollis risus ut consectetur pharetra. Mauris fringilla nibh risus, eget porttitor arcu faucibus porta. In consequat turpis eget lorem venenatis, ut viverra orci luctus. In semper imperdiet felis vitae ornare. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Curabitur dolor felis, scelerisque et rhoncus sed, consectetur sed neque. Donec at magna ullamcorper, accumsan nibh at, ultrices augue fim', 782.24),
(6, 'Culinaria', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', 198.66),
(11, 'Filosofia I - A vida', 'Cras id molestie nisl. In ut auctor risus. Quisque vel erat a elit pulvinar lacinia eu vitae enim. Nulla ut odio auctor, tempor arcu vitae, placerat turpis. Suspendisse scelerisque elementum dignissim. Maecenas id nibh mauris. Donec quis porttitor ex, vel porta odio. Maecenas lacinia aliquet nunc, ac fringilla augue blandit rutrum. Duis elementum faucibus justo non sodales. In semper mattis justo. Pellentesque non libero finibus lorem maximus fermentum. Integer porta leo eu lorem mattis vulputate.', 755.61),
(12, 'Musica I', 'Nunc ut lectus cursus, aliquet erat commodo, sagittis nisi. Maecenas ut pellentesque tellus. Proin massa dolor, porta nec neque sit amet, gravida egestas augue. Nullam non mi urna. Sed sit amet porta ex, at feugiat libero. Donec felis purus, scelerisque ut molestie a, condimentum at orci. Nullam ex arcu, volutpat id nibh vel, cursus porta risus. Quisque lacinia varius neque, non efficitur eros sagittis id. Donec dignissim maximus orci, et elementum orci egestas quis. Curabitur malesuada, ligula sit amet mollis semper, orci mauris fringilla turpis, consequat porttitor tellus orci a dui. Nulla velit magna, rhoncus ut nisi in, aliquet facilisis nulla. Fusce et congue nisi. Curabitur convallis urna convallis, vestibulum ipsum quis, rutrum magna. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer interdum elit dolor, a tempor magna consectetur a. Curabitur vitae leo risus.', 2652.88);

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`codigo`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `curso`
--
ALTER TABLE `curso`
  MODIFY `codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
